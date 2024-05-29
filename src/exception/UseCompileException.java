package exception;

public class UseCompileException {
	
	public UseCompileException() {
		//특정 클래스를 입력받아 객체를 사용
		try {
			Class cls = Class.forName("exception.UseRunTimeException2");
		} catch (ClassNotFoundException e) {
			System.err.println("앗! 파일이 ㅇㅅㅇ");
			e.printStackTrace();
		}
		
		
	}

	public static void main(String[] args) {
		new UseCompileException();
	}

}
