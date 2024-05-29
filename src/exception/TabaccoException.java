package exception;

public class TabaccoException extends Exception {//CompileException 으로 만들 때
	public TabaccoException() {
		super("담배는 질변의 원인이 되며 ,,, 청소년 판매 금지");
	}
	
	public TabaccoException(String msg) {
		super(msg);// 매개변수인 메세지를 출력함
	}

}
