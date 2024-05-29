package exception;

import java.util.Random;

public class TestThrows {
	/**
	 * method에서 throw로 예외를 던지면, 호출한 곳 에서 예외를 잡아서
	 * 처리를 하게 된다. 예외 발생 예상 코드를 가진 method 안에서는 try~catch
	 * 로 처리를 할 필요가 없다.
	 * @throws ClassNotFoundException
	 */
	public void loadClass() throws ClassNotFoundException {
		String clsName = "java.lang.String";
	if(new Random().nextBoolean()) {
		//랜덤으로 나온 값이 참이면 clsName이 바뀐다.
		clsName = "java.lang.String2";
	}//end if
	Class cls = Class.forName(clsName);
	//
	System.out.println(cls+"클래스를 로딩했습니다.");
	}
	public static void main(String[] args) {
		TestThrows tt = new TestThrows();
		try {
			tt.loadClass();
		} catch (ClassNotFoundException e) {
			//비 정상적 일 때의 코드
			System.err.println("클래스가 ㅇㅅㅇ");
		}
	}

}
