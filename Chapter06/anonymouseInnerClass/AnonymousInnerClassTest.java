package anonymouseInnerClass;

import javax.swing.JOptionPane;

public class AnonymousInnerClassTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TalkingClock clock = new TalkingClock();
		clock.start(1000, true);
		
		JOptionPane.showMessageDialog(null, "Quit program?");
		System.exit(0);
	}

}
