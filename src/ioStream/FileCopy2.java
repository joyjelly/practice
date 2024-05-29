package ioStream;

import java.awt.FileDialog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

@SuppressWarnings("serial")
public class FileCopy2 extends JFrame implements ActionListener {

	private JLabel JlOutput;

	public FileCopy2() {
		super("NIO를 사용한 파일 복사");

		JButton jbtnCopy = new JButton("복사할 파일 선택");
		JlOutput = new JLabel("복사할 파일을 선택해 주세요");
		JPanel jpCenter = new JPanel();
		jpCenter.add(jbtnCopy);
		JlOutput.setBorder(new TitledBorder("출력"));

		add("Center", jpCenter);
		add("South", JlOutput);

		jbtnCopy.addActionListener(this);

		setBounds(100, 100, 300, 400);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}// FileCopy2
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}//actionPerformed

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
