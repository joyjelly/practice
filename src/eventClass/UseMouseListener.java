package eventClass;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.border.TitledBorder;

/**
 * 마우스 액션 리스너를 구현해서
 * dlm 의 인덱스를 받아서 다른 dlm로 옮기고 삭제하는 작업들.
 */
@SuppressWarnings("serial")
public class UseMouseListener extends JFrame implements MouseListener,ActionListener {
	private DefaultListModel<String> dlmFriends;
	private DefaultListModel<String> dlmBlockedFriends;
	private JList<String> JlFriends;
	private JList<String> JlBlockedFriends;
	private JButton jbtnBlockAll;
	private JButton jbtnUnBlockAll;

	public UseMouseListener() {
		super("친구리스트");
		//MVC 패턴이 도입된 컴포넌트는 Model에 값을 저장한다.
		dlmFriends = new DefaultListModel<String>();
		dlmFriends.addElement("고한별");
		dlmFriends.addElement("이주희");
		dlmFriends.addElement("이명화");
		dlmFriends.addElement("윤웅찬");
		dlmFriends.addElement("진수현");
		
		dlmBlockedFriends = new DefaultListModel<String>();
		//모델 객체와 has a 관계로 view 객체를 생성
		JlFriends = new JList<String>(dlmFriends);
		JlBlockedFriends = new JList<String>(dlmBlockedFriends);
		
		jbtnBlockAll = new JButton(">>");
		jbtnUnBlockAll = new JButton("<<");
		
		JScrollPane jspFriends = new JScrollPane(JlFriends);
		JScrollPane jspbFriends = new JScrollPane(JlBlockedFriends);
		
		jspFriends.setBorder(new TitledBorder("친구"));
		jspbFriends.setBorder(new TitledBorder("차단된 친구"));
		
		//이벤트 등록
		JlFriends.addMouseListener(this);
		JlBlockedFriends.addMouseListener(this);
		jbtnBlockAll.addActionListener(this);
		jbtnUnBlockAll.addActionListener(this);
		
		//수동배치
		setLayout(null);
		jspFriends.setBounds(20, 40, 150, 200);
		jbtnBlockAll.setBounds(190, 130, 50, 30);
		jspbFriends.setBounds(250, 40, 150, 200);
		jbtnUnBlockAll.setBounds(190, 160, 50, 30);
		add(jspFriends);
		add(jbtnBlockAll);
		add(jspbFriends);
		add(jbtnUnBlockAll);

		setVisible(true);
		setBounds(100, 100, 440, 300);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	@Override
	public void mouseClicked(MouseEvent me) {
//	키의 작업이 종료된 후
		//어떤 키가 눌리든 호출된다 : 키에 대한 비교.
//		switch(me.getButton()) {
//		}
		if(me.getSource()== JlFriends) {
			int index = JlFriends.getSelectedIndex();
			if(index != -1) {
		//선택된 인덱스에 해당하는 값을 Model에서 얻고(이름)
			String name = dlmFriends.getElementAt(index);
		//얻어낸 이름을 차단된 친구로 등록
			dlmBlockedFriends.addElement(name);
		//선택된 인덱스의 값을 Model에서 삭제
			dlmFriends.remove(index);
			}
		}//end if
		if(me.getSource()== JlBlockedFriends) {
			int index = JlBlockedFriends.getSelectedIndex();
			if(index != -1) {
		//선택된 인덱스에 해당하는 값을 Model에서 얻고(이름)
			String name = dlmBlockedFriends.getElementAt(index);
		//얻어낸 이름을 친구로 등록
			dlmFriends.addElement(name);
		//선택된 인덱스의 값을 Model에서 삭제
			dlmBlockedFriends.remove(index);
			}
		}//end if
		
	}//mouseClicked

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	public static void main(String[] args) {
		new UseMouseListener();
	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		//친구 리스트에서 모든 값을 가져와서 차단된 친구 리스트에 넣고 삭제.
		Object [] str = new Object[dlmFriends.size()];
		str = dlmFriends.toArray();
		if(ae.getSource()==jbtnBlockAll) {
			for(Object values : str) {
				dlmBlockedFriends.addElement(values.toString());
			}//end for
			//블락한 친구 모두 친구리스트에서 삭제
			dlmFriends.removeAllElements();
		}
		//친구 리스트에서 모든 값을 가져와서 차단된 친구 리스트에 넣고 삭제.
		Object [] str1 = new Object[dlmBlockedFriends.size()];
		str = dlmBlockedFriends.toArray();
		if(ae.getSource()==jbtnUnBlockAll) {
			for(Object values : str) {
				dlmFriends.addElement(values.toString());
			}//end for
			//블락한 친구 모두 친구리스트에서 삭제
			dlmBlockedFriends.removeAllElements();
		}
		
	}
}
