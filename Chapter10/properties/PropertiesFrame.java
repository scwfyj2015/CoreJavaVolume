package properties;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class PropertiesFrame extends JFrame{
	private static final int DEFAULT_WIDTH = 300;
	private static final int DEFAULT_HEIGHT = 200;
	
	private File propertiesFile;
	private Properties settings;
	
	public PropertiesFrame() {
		// TODO Auto-generated constructor stub
		String userDir = System.getProperty("user.home");
		File propertiesDir = new File(userDir, ".corejava");
		if(!propertiesDir.exists()){
			propertiesDir.mkdirs();
		}
		
		propertiesFile = new File(propertiesDir, "program.properties");
		
		Properties defaultSettings = new Properties();
		defaultSettings.put("left", "0");
		defaultSettings.put("top", "0");
		defaultSettings.put("width", DEFAULT_WIDTH);
		defaultSettings.put("height", DEFAULT_HEIGHT);
		defaultSettings.put("title", "");
		
		settings = new Properties(defaultSettings);
		
		if(propertiesFile.exists())try{
			FileInputStream in = new FileInputStream(propertiesFile);
			settings.load(in);
		}catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		int left = Integer.parseInt(settings.getProperty("left"));
		int top = Integer.parseInt(settings.getProperty("top"));
		int width = 300;
		int height = 200;
//		int width = Integer.parseInt(settings.getProperty("width"));
//		int height = Integer.parseInt(settings.getProperty("height"));
		setBounds(left, top, width, height);
		
		String title = settings.getProperty("title");
		if(title.equals(""))
			title = JOptionPane.showInputDialog("Please supply a frame title:");
		if(title == null){
			title = "";
		}
		setTitle(title);
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				settings.put("left", ""+getX());
				settings.put("top", ""+getY());
				settings.put("width", ""+getWidth());
				settings.put("heigh", ""+getHeight());
				settings.put("title", ""+getTitle());
				try{
					FileOutputStream out = new FileOutputStream(propertiesFile);
					settings.store(out, "Program properties");
				}
				catch (IOException e1) {
					// TODO: handle exception
					e1.printStackTrace();
				}
				System.exit(0);
			}
		});
	}
}
