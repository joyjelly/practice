package ioStream;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UseTryWithResources {

	public static void main(String[] args) {
		//키보드의 입력값을 줄 단위로 읽기
		//개발자가 close 하지 않아도 JVM에서 close() 해준다.
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
			System.out.println("아무키나 누르고 엔터.");
			String readData =br.readLine();
			System.out.println("입력값 : "+readData);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

