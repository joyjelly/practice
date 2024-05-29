package ioStream;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 * 1. InputDialoge 를 사용하여 경로를 입력받음
 * 2. 입력된 문자열에 해당하는 경로가 존재하면 아래와 같이 디렉토리 내 모든 디렉토리와
 * 파일명을 JTextArea에 출력하는 프로그램을 작성.
 * 3.디렉토리는 크기를 출력하지 않고 파일에 대해서만 byte 크기를 출력해주세요.
 */
public class day0205HW extends JFrame {
	public day0205HW() {
		String input = "";
		input = JOptionPane.showInputDialog("경로를 입력해 주세요!");
		File file = new File(input);
		File []flist = file.listFiles();
		
		if(!file.exists()) {
			JOptionPane.showMessageDialog(null, "입력한 경로를 확인하세요.");
			return;
		}
		
		StringBuilder sb = new StringBuilder();
		sb.append("이름\t수정한날짜\t유형\t크기\n");
		long last = file.lastModified();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
		if(file.exists()) {
			for(int i =0; i<flist.length;i++) {
				
			sb.append(flist[i].getName()+"\t").append(sdf.format(new Date(flist[i].lastModified()))+"\t").
			append(flist[i].isFile()? "파일\t":"디렉토리\t")
			.append(flist[i].length()+"\t").append("\n");
			
			}
		}//end if
//		JOptionPane.showMessageDialog(null, sb.toString());
		JTextArea jta = new JTextArea(sb.toString(),50,50);
		JScrollPane jsp = new JScrollPane(jta);
		add(jsp);
		setSize(400, 400);
		setVisible(true);
	}
	

	public static void main(String[] args) {
		new day0205HW();
	}

}
