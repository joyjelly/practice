package eventClass;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;

/**
 * 윈도우 이벤트의 연습.
 */
public class TestWindowEvent extends JFrame implements WindowListener{
	public TestWindowEvent() {
		super("윈도우 이벤트 연습");
		
		//window component를 이벤트에 등록.
		
		addWindowListener(this);
		
		setSize(400,400);
		setVisible(true);
	}

	@Override
	public void windowOpened(WindowEvent e) {
			System.out.println("windowOpened");		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		System.out.println("windowClosing");
		dispose();
	}

	@Override
	public void windowClosed(WindowEvent e) {
		System.out.println("windowClosed");		
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		System.out.println("windowIconified");		
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		System.out.println("windowActivated");		
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		System.out.println("windowDeactivated");		
		// TODO Auto-generated method stub
		
	}

	public static void main(String[] args) {
		new TestWindowEvent();
	}
}
