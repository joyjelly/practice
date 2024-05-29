package ioStream;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * 16비트 스트림을 사용한 텍스트 파일의 내용 읽기.
 */
public class UseFileReader {
	public UseFileReader() throws IOException {
		//1.파일 생성
		File readFile = new File("C:/dev/temp/java_Read.txt");
		if(!readFile.exists()) {
			System.out.println(readFile.getAbsolutePath()+"는 존재하지 않습니다. 경로를 확인하세요.");
			return;
		}
		//2. Stream 생성
		BufferedReader br = null;
		
		
		
		try {
			br= new BufferedReader(new FileReader(readFile));
		
		//3. 스트림에 연결 되어있는 파일을 읽어들인다.
			String str = "";
			//readLine이 널이 아니라면 한 줄을 읽어들이고, 그 줄을 출력한다.
			while((str = br.readLine())!=null) {
				System.out.println(str);
			}//end while
			
		} finally {
			if(br !=null) {br.close();
			}//end if
		}//end finally
	}//UseFileReader

	public static void main(String[] args) {
		try {
			new UseBufferedReader();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
