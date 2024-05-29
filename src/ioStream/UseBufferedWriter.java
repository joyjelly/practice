package ioStream;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * bufferedWriter의 사용
 */
public class UseBufferedWriter {
	public UseBufferedWriter() {
		//1. 파일 생성
		File file = new File("c:/dev/temp/java_write3.txt");
		
		//2. 스트림 생성
		try 
		(BufferedWriter bw = new BufferedWriter(new FileWriter(file))){
			String msg = "이것이 자바다. 신용권 저";
			
			//3.스트림에 파일로 출력 할 데이터를 기록
			bw.write(msg);
			//4.
			bw.flush();
			
			System.out.println("파일로 기록 완료");
		}catch(IOException e) {
			
		}
		
	
		}
	public static void main(String[] args) {
		new UseBufferedWriter();
	}

}
