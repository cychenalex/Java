package tw.org.iii.tutor;

import javax.swing.JFrame;

public class Alex20 extends JFrame {
	public Alex20()
	{
		super("我的視窗");    // JFrame(String);
		
		setSize(640, 480);
		
		setVisible(true);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new Alex20();

	}

}
