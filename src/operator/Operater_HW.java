package operator;

public class Operater_HW {

	public static void main(String[] args) {
		//1-1.두 정수를 저장할 수 있는 변수를 만들고, 임의의 값을 할당한다.
		//1-2.위의 변수중에 큰 값을 반환하는 코드(삼항 연산자 사용)를 만들어보세요
		int i =22000;
		int j =100;
		
		System.out.println("i와 j중 더 큰 값은"+(i>j ? "i":"j") +"입니다." );
		
		//문제2
		//1-1. 세개의 정수를 저장할 수 있는 변수를 만들고, 각각의 변수의 임의의 값을 할당한다.
		//1-2. 세개의 숫자중 가장 작은 값을 찾아서 출력하는 코드를 만들어보세요.(삼항연산자 사용)
		
		int a =2;
		int b =7;
		int c =1;
		//((a<b)? a:b)<c ? (a<b)? a:b): c
		//((a<b)? a:b) ->첫번째 연산
		//(((((a<b)? a:b))<c)? ((a<b)? a:b):c )
		System.out.println("a,b,c중 가장 작은 값은"+(((((a<b)? a:b))<c)? ((a<b)? a:b):c )+"입니다.");
		
		
		
		
	}

}
