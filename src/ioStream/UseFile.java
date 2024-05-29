package ioStream;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Use File을 사용한 파일 접근
 */
public class UseFile {

	public static void main(String[] args) {
		//1.생성
		File file = new File("c:/dev/temp/java_read.txt");
		System.out.println(file);
		
		if(!file.exists()) {
			//파일이 없으면 얼리리턴
			System.out.println("파일이 ㅇㅅㅇ");
			return;
		}
		System.out.println(file.isFile()? "파일":"디렉토리");
		System.out.println(file.isDirectory()? "파일":"디렉토리");
		System.out.println(file.canRead()? "읽을 수 있음":"XX");
		System.out.println(file.canWrite()? "쓸 수 있음":"XX");
		System.out.println(file.canExecute()? "사용 가능":"XX");
		System.out.println("byte : 파일의 크기 : "+file.length());
		System.out.println("절대경로 : "+file.getAbsolutePath());
		try {
			System.out.println("파일의 규범경로 :"+file.getCanonicalPath());
		} catch (IOException e) {
			System.out.println("에러");
		}//end catch
		
		System.out.println("경로 :"+file.getParent());
		System.out.println("파일 명 :"+file.getName());
		long lastModified = file.lastModified();
		System.out.println("파일이 마지막으로 수정 된 날짜 :"
		+lastModified);
		System.out.println("파일이 마지막으로 수정 된 날짜 :"
				+new Date(lastModified));
		//sdf로 시간표현 변환
		SimpleDateFormat sdf = new SimpleDateFormat("yyy-MM-dd");
		System.out.println(sdf.format(new Date(lastModified)));
		
	}

}
