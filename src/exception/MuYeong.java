package exception;

import java.util.Random;

/**
 * throw: 사용자 정의 예외 클래스와 함께 사용.
 * - 사용자 정의 예외처리 클래스를 제작할 때 Java API에서 제공하는 
 * 예외처리 클래스가 내가 구현하는 업무의 성격과 같은 이름으로 존재하지 않을 때 정의하여
 * 만드는 예외처리 클래스.
 * 
 */
public class MuYeong {
	public String walk() throws Exception {
		String msg ="";
		//flag에 4개의 난수를 넣음(0~3)
		int flag = new Random().nextInt(4);
		
		//문자열 배열에 타이틀을 넣음.
		String[] title =
			{"초딩","중딩","대딩","고딩"};
		msg = title[flag]+"님 흡연중 모른척 지나간다. ('' )( '')";
		if(flag ==0) {//초딩이 흡연중이면 예외를 강제 발생
			throw new Exception(title+"님 금연하셈");
		}
		
		
		return msg;
				
		
	}
	public String walk2() throws TabaccoException {
		String msg ="";
		//flag에 4개의 난수를 넣음(0~3)
		int flag = new Random().nextInt(4);
		
		//문자열 배열에 타이틀을 넣음.
		String[] title =
			{"초딩","중딩","대딩","고딩"};
		msg = title[flag]+"님 흡연중 모른척 지나간다. ('' )( '')";
		if(flag ==0) {
			throw new TabaccoException(title+"님 담배ㄴㄴ");
		}
		
		
		return msg;
		
		
	}

	public static void main(String[] args) {
		MuYeong my = new MuYeong();
		// 내부에서 try~catch를 하면밖에서 봤을 때 method 내부에서 어떤 문제가 발생할지 모른다.
		try {
			String 
			msg = my.walk2();
			System.out.println(msg);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
