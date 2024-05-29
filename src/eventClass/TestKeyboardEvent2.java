package eventClass;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

//1. keyListener를 구현
public class TestKeyboardEvent2 extends JFrame {
//3.이벤트 처리와 관련있는 컴포넌트를 인스턴스 변수로 선언.	

	private JTextArea jta;
	private JTextField jtf;

	public TestKeyboardEvent2() {
		super("키보드 이벤트");
		jtf = new JTextField();
		jta = new JTextArea();

		// jta에 스크롤페인 설치
		JScrollPane jsp = new JScrollPane(jta);

		jtf.setBorder(new TitledBorder("아무 키나 누르세요"));
		jsp.setBorder(new TitledBorder("눌린 키의 정보"));

		// 2. anonymous inner class로 이벤트 처리
		jtf.addKeyListener(new KeyAdapter() {

			/**
			 * 눌린 키의 키 코드와 키 값을 얻는다.
			 * esc를 누르면 창 종료.
			 */
			@Override
			public void keyReleased(KeyEvent ke) {
				char c = ke.getKeyChar();
				int code = ke.getKeyCode();

				// jta에 출력
				jta.append("눌린 키 코드 :" + code + " 눌린 문자 :" + ke.getKeyChar() +"\n");
				
				
				if(ke.getKeyCode()==27) {
					dispose();
				}
			}

		});
		add("North",jtf);
		add("Center",jsp);
		
		
		setSize(400, 400);
		setVisible(true);
		
		
	}

	public static void main(String[] args) {
		new TestKeyboardEvent2();
	}

}
