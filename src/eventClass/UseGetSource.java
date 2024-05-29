package eventClass;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

/**
 * 액션리스너를 구현해서, 컴포넌트가 눌렸을 때 발생할 이벤트들을 설정하기.
 * 버튼 ,버튼2가 눌렸을 때 + 엔터가 눌렸을 때
 */
public class UseGetSource extends JFrame implements ActionListener {
	private JButton jbtn;
	private JButton jbtn2;
	private JTextField jtf;

	public UseGetSource() {
		super("주소를 사용한 이벤트 발생 객체 비교");
		jbtn = new JButton("버튼");
		jbtn2 = new JButton("버튼2");
		jtf = new JTextField(10);
		
		jbtn.addActionListener(this);
		jbtn2.addActionListener(this);
		jtf.addActionListener(this);
		setLayout(new FlowLayout());
		add(jbtn);
		add(jbtn2);
		add(jtf);
		
		setBounds(100, 100, 400, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}//UseGetSource
	@Override
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource() == jbtn) {
			System.out.println("버튼 1이 눌림");
		}
		if(ae.getSource() == jbtn2) {
			System.out.println("버튼 2이 눌림");
		}
		if(ae.getSource() == jtf) {
			System.out.println("텍스트필드에서 엔터가 눌렸을 때 제공할 코드");
		}
		
	}//actionPerformed
	public static void main(String[] args) {
		new UseGetSource();
	}//main

}//class
