package ioStream;

import java.io.File;

/**
 * 디렉토리 생성
 */
public class UseFile2 {

	public static void main(String[] args) {
		//1.File 생성
		File file = new File("c:/dev/kis");
		
		//2.생성
		//부모 디렉토리가 존재하면 mkdir이나 mkdirs 모두 하위 디렉토리를 잘 생성한다.
		System.out.println(file.mkdir());
		
		File file2 = new File("c:/temp/test");
//		부모 디렉토리(Temp) 가 존재하지 않으면  mkdir은 하위디렉토리를 만들지 못한다.
//		System.out.println(file2.mkdir());
		
//		mkdirs 는 부모 디렉토리(Temp) 가 존재하지 않으면 부모 디렉토리부터 생성한다.
		System.out.println(file2.mkdirs());
	}

}
