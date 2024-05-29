package eventClass;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

//1.Window Component 상속
/**
 * 폰트 적용, 글자 색, 투명도 설정하기
 */
@SuppressWarnings("serial")
public class UseActionEvent extends JFrame {
	public UseActionEvent() {
		super ("여러 레이아웃 매니저 사용");
		//2.컴포넌트 생성
		
		JLabel jlblName = new JLabel("이름");
		JTextField jtfName = new JTextField(10);
		JComboBox<String> jcbgender = new JComboBox<String>();
		jcbgender.addItem("남자");
		jcbgender.addItem("여자");
		JButton jbtnInput = new JButton("입력");
		
		//글꼴 적용
		//1.Font 클래스 생성
		Font font = new Font("고딕체", Font.BOLD, 20);
		jlblName.setFont(font);
		jtfName.setFont(font);
		jcbgender.setFont(font);
		jbtnInput.setFont(font);
		
		//글자 색 =>상수
		jlblName.setForeground(Color.DARK_GRAY);
		
		//RGB
		Color color = new Color(0x03CD5C);
		jcbgender.setForeground(color);
		
		
		JTextArea jta = new JTextArea();
		jta.setFont(new Font("맑은 고딕",Font.BOLD | Font.ITALIC,30));
		jta.setBackground(Color.cyan);	
		
		JPanel jpNorth = new JPanel();
		jpNorth.add(jlblName);
		jpNorth.add(jtfName);
		jpNorth.add(jcbgender);
		jpNorth.add(jbtnInput);
		
		//윈도우 컴포넌트에 (사용자에게 보여주는 일) 배치
		add("North",jpNorth);
		add("Center",jta);
		
		//4.크기설정
		setSize(400, 400);;
		
		//5.가시화
		setVisible(true);
		
		//6.종료
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}
	
	
	public static void main(String[] args) {
		new UseActionEvent();
	}

}
