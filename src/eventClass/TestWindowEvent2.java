package eventClass;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class TestWindowEvent2 extends JFrame{
	public TestWindowEvent2() {
		super("윈도우 이벤트 연습");
		//has a 이벤트 처리
		
//		Window Component를 이벤트에 등록
//		WindowAdapterSub was = new WindowAdapterSub(this);
//		addWindowListener(was);
	
		addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				dispose();
			}
			
		
		
		});
		
		setSize(400, 400);
		setVisible(true);
	}
	
	
	
	
	public static void main(String[] args) {
		new TestWindowEvent2();
	}

}
