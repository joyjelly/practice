package jFrame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * 부가적인 기능을 제공하기 위해 제작하는 창 : Dialog
 */
@SuppressWarnings("serial")
public class SubJDialoge extends JDialog implements ActionListener {

	public SubJDialoge(ParentFrame pf) {
		super(pf,"부가적인 기능",true); //modal
//		super(pf,"부가적인 기능",false);//non-modal
		ImageIcon ii = new ImageIcon("C:/Users/user/Desktop/9k.png");
		JLabel jlback = new JLabel("자식창에서 제공하는 이미지",ii,JLabel.CENTER);
		
		JButton jbtn = new JButton("닫기");
		JPanel jp = new JPanel();
		jp.add(jbtn);
		
		add("Center",jlback);
		add("South",jp);
		
		//JDialog는 이벤트 등록 코드를 항상 setVisible 전에 정의해야 한다.
		jbtn.addActionListener(this);
		
		//JDialog의 종료
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		
		setBounds(pf.getX()+125, pf.getY()+150, 244, 200);
		setVisible(true);
		
		
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
	dispose();
	}

}
