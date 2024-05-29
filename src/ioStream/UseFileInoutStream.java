package ioStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class UseFileInoutStream {
	public UseFileInoutStream() throws IOException {
		// 1. 파일 생성
		File file = new File("C:/dev/temp/java_Read.txt");
		if (!file.exists()) {
			JOptionPane.showMessageDialog(null, "파일 명이나 경로를 확인 해 주세요.");
			return;
		} // end if
			// 2. 파일을 읽기 위한 Stream을 연결.
		FileInputStream fis = null;

		try {
			fis = new FileInputStream(file);
			int readData = 0;
			// 1byte를 읽어들여 값이 존재한다면
			while ((readData = fis.read()) != -1) {
				// 값을 출력한다.
				System.out.println((char) readData);

			} //// end while
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (fis != null) {
				fis.close();
			} // end
		}//end finally
	}//UseFileInoutStream

	public static void main(String[] args) {
		try {
			new UseFileInoutStream();
		} catch (IOException e) {
		
		}
		
		JTextArea jta = new JTextArea(10,50);
		JScrollPane jsp = new JScrollPane(jta);
		
		jta.setText("포항항 ^0^");
		jta.setEditable(false);//문장 수정 불가.
		JOptionPane.showMessageDialog(null, jsp);
		

	}

}
