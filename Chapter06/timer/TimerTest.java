package timer;

import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.Timer;

public class TimerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ActionListener listener = new TimePrinter();
		Timer t = new Timer(5000, listener);
		t.start();
		
		JOptionPane.showMessageDialog(null, "Quit program?");
		System.exit(0);
	}

}
