package operator;

/**
 * 대입연산
 * 
 *
 */
public class operator_7 {
	public static void main(String[] args) {
		//순수대입
		int i = 11;
		i= 25; //기존의 값이 사라짐.
		System.out.println(i);
		
		//산술대입 : 기존의 값과 연산 후 연산 결과를 다시 변수에 할당.
		i+=2; // i = i+2;
		i-=20;
		i*=3;
		i/=3;
		i%=3;
		System.out.println(i);
		
	}
}
