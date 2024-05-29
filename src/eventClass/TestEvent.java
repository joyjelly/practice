package eventClass;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

//1. 윈도우 컴포넌트를 상속받고, 이벤트 처리 리스너를 구현.
@SuppressWarnings("serial")
public class TestEvent extends JFrame implements ActionListener {

	public TestEvent() {
		super("이벤트 연습");
		JButton jb = new JButton("버튼");
		JPanel jp = new JPanel();
		
		
		//3. 컴포넌트를 이벤트에 등록
		jb.addActionListener(this);
		jp.add(jb);
		//제이버튼이 액션리스너에 등록됨.
		
		
		add("Center",jp);
		setSize(300,300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}
	
	
	public static void main(String[] args) {
		new TestEvent();
	}

	/**
	 * 2. 리스너에 Abstract Method를 오버라이드 한다.
	 * 이벤트가 발생했을 때 제공할 코드를 작성함.
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println(e);
		JOptionPane.showMessageDialog(this, "버튼을 눌렀습니다.");
	}

}
