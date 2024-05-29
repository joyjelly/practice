package jFrame;

import java.awt.FileDialog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ParentFrame extends JFrame implements ActionListener {
	private JButton jbtn, jbtnOpen, jbtnSave;

	public ParentFrame() {
		super("다이얼로그 연습");

		jbtn = new JButton("다이얼로그");
		jbtnOpen = new JButton("파일 다이얼로그 열기");
		jbtnSave = new JButton("파일 다이얼로그 저장");

		JPanel jp = new JPanel();
		jp.add(jbtn);
		jp.add(jbtnOpen);
		jp.add(jbtnSave);

		jbtn.addActionListener(this);
		jbtnOpen.addActionListener(this);
		jbtnSave.addActionListener(this);

		add("Center", jp);
		setSize(500, 500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}// ParentFrame

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == jbtn) {
			new SubJDialoge(this);
		}
		if (e.getSource() == jbtnOpen) {
			open();
		}
		if (e.getSource() == jbtnSave) {
			save();
		}
	}// actionPerformed

	/**
	 * 파일을 저장하는 파일 다이얼로그를 불러온다.
	 */
	public void save() {
		FileDialog fdSave = new FileDialog(this, "파일 열기", FileDialog.LOAD);
		fdSave.setVisible(true);
		String path = fdSave.getDirectory();
		String fName = fdSave.getFile();

		if (path != null) {// 취소를 누르면 경로나 파일명에 null이 입력.
			if (path.length() > 10) {
				path = path.substring(0, 10) + "...";
			} // end if
			setTitle("저장" + path + fName);// 파일의 경로와 이름을 부모의 타이틀로 저장
		} // end if
	}//save

	/**
	 * 파일을 여는 파일 다이얼로그를 불러온다. 파일 경로의 길이가 10자가 넘으면 ...로 축약
	 */
	public void open() {
		FileDialog fdOpen = new FileDialog(this, "파일 열기", FileDialog.LOAD);
		fdOpen.setVisible(true);
		String path = fdOpen.getDirectory();
		String fName = fdOpen.getFile();

		if (path != null) {// 취소를 누르면 경로나 파일명에 null이 입력.
			if (path.length() > 10) {
				path = path.substring(0, 10) + "...";
			} // end if
			setTitle("열기" + path + fName);// 파일의 경로와 이름을 부모의 타이틀로 저장
		} // end if

	}//open

	public static void main(String[] args) {
		new ParentFrame();
	}// main

}// class
