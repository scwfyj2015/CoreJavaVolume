package innerClass;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.Timer;

public class TalkingClock {
	private int interval;
	private boolean beep;
	
	public TalkingClock(int i, boolean b) {
		// TODO Auto-generated constructor stub
		this.interval = i;
		this.beep = b;
	}
	
	public void start(){
		ActionListener listener = new TimePrinter();
		Timer t = new Timer(5000, listener);
		t.start();
	}
	
	
	public class TimePrinter implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			Date now = new Date();
			System.out.println("at the tone, the time is:"+now);
			if(beep){
				Toolkit.getDefaultToolkit().beep();
			}
		}
		
	}
}
