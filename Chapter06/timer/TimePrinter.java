package timer;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class TimePrinter implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Date now = new Date();
		System.out.println("at the tone ,the time is :" + now);
		//getDefaultToolkit() : 获得默认的工具箱，工具箱包含有关gui环境的信息。
		//beep()  发出一声铃响。
		Toolkit.getDefaultToolkit().beep(); 
	}

}
