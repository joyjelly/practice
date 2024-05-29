package ioStream;

import java.io.File;

import javax.swing.JOptionPane;

/**
 * 파일의 삭제와 파일명 변경
 */
public class UseFile3 {

	public static void main(String[] args) {
//	1.삭제 할 파일명을 가진 File 객체를 생성.
//	File file = new File("c:/dev/temp/java_Read2.txt");
//	//2. 삭제
//	System.out.println(file.delete());

		// 1. 이전 이름을 가진 File 객체 생성
		File file = new File("c:/dev/temp/java_read2.txt");
		// 2. 변경 할 파일명을 저장한 객체를 생성.
		File file2 = new File("c:/dev/temp/kis.txt");
		System.out.println(file.renameTo(file2));

		// JOptionPane.showInputDialog를 사용하여 삭제할 파일의 경로와 파일명을 받는다->
		// 해당 파일이 존재한다면 ComfirmDialoge를 사용하여 "정말 삭제하시겠습니까?"를 물어본 후
		// "예"가 눌리면 삭제하는 프로그램을 작성

		String inputPath = JOptionPane.showInputDialog("삭제 할 파일의 경로와 파일 명을 작성하세요.");
		File inputFile = new File(inputPath);
		if (!inputFile.exists()) {
			JOptionPane.showMessageDialog(null, "파일의 경로를 확인하세요.");
		}
		switch (JOptionPane.showConfirmDialog(null, "정말 삭제하시겠습니까?")) {
		case JOptionPane.OK_OPTION:
			file.delete();
			JOptionPane.showMessageDialog(null, "파일이 삭제 되었습니다.");
		}

	}

}
