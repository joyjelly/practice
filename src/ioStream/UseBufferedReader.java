package ioStream;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * bufferedReader를 이용한 줄단위 읽기
 */
public class UseBufferedReader {

	public UseBufferedReader() throws IOException {
		// 1. file 생성

		File readFile = new File("C:/dev/temp/java_Read.txt");
		if (!readFile.exists()) {
			System.out.println(readFile.getAbsolutePath() + "는 존재하지 않습니다.");
			return;
		} // end if

		// 2.Stream 생성
//		FileInputStream fis = new FileInputStream(readFile); //파일과 연결
//		//8비트 스트림+16비트 스트림과 연결
//		InputStreamReader isr = new  InputStreamReader(fis);
//		BufferedReader br = new BufferedReader(isr);
		BufferedReader br = null;
		try {
			br = new BufferedReader(new InputStreamReader(new FileInputStream(readFile)));
			String str = "";
			while ((str = br.readLine()) != null) {
				System.out.println(str);
			}
		} finally {
			if (br != null) {
				br.close();
			}

		} // end while

	}

	public static void main(String[] args) {
		try {
			new UseBufferedReader();
		} catch (IOException e) {
		}

	}

}
