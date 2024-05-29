package ioStream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

public class TestStream {
	public TestStream() throws IOException {
		// c:dev/temp/java_Read.txt를 읽어와서
		// c:dev/temp/java_Read4.txt 파일을 생성한 후 읽어들여온 내용을 모두
		// java_write4.txt 로 쓰는 코드를 작성하세요.
		// 단, dev/temp/java_Read.txt4.txt 파일이 존재하지 않으면 파일을 생성하고,
		// 존재한다면 덮어쓸 것인지 물어본 후 파일에 덮어쓴다.
		
		File r_file = new File("c:dev/temp/java_Read.txt");
		File w_file = new File("c:dev/temp/java_Read4.txt");
		
		if(w_file.exists()) {
			//NO/Cancel이면 얼리리턴
			switch(JOptionPane.showConfirmDialog(null, "덮어쓰시겠습니까?")) {
			case JOptionPane.NO_OPTION:
			case JOptionPane.CANCEL_OPTION:
				return;
			}//end switch
		}
		
		BufferedReader br =null;
		BufferedWriter bw =null;
		try {
		 br = new BufferedReader(new FileReader(r_file));
		 bw = new BufferedWriter(new FileWriter(w_file));
		String str ="";
		//str은 버퍼드리더에서 읽어들이는 줄,
		//받아들인 그 줄을 바로 write+줄바꿈으로 작성
		while((str=br.readLine())!=null) {
		 bw.write(str+"\n");
		}
		bw.flush();
		}finally {
			if(br!=null) {br.close();}
			if(bw!=null) {bw.close();}
		}
		
		
	}

	public static void main(String[] args) {
		try {
			new TestStream();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
