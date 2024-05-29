package ioStream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 8bit Stream을 이용한 파일 출력
 */
public class UseFileOutputStream {
	
	public UseFileOutputStream() throws IOException {
		//1. 파일 생성
		
		File file = new File("c:/dev/temp/java_write.txt"); 
		//2.스트림 생성 : 스트림이 생성되면 목적지에  파일이 존재하면 덮어쓰고, 엎으면 만들기
		
		
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream(file);
			//3.스트림에 파일로 보낼 내용 쓰기
			String str = "IO 개시러";
			byte[] b = str.getBytes();
			fos.write(b);
			//4.목적지로 분출
			fos.flush();
		}finally {
			if (fos!=null) {
				fos.close();
			}
		}
	}

	public static void main(String[] args) {
		try {
			new UseFileOutputStream();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
