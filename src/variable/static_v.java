package variable;

/**
 * static variable
 * - 객체화 없이 클래스 명으로 직접 접근하여 사용할 수 있는 변수.
 * - 프로그램이 실행되면 메모리에 올라가고, 실행이 끝나면 메모리에서 내려온다.
 * - 자동초기화 (값 할당 하지 않고 사용하더라도 error가 발생하지 않는다.)
 * - 하나의 변수만 만들어진다.
 * - 모든 instance(객체)가 하나의 변수를 참조하고 사용한다. (공용)
 */
public class static_v {
	//1.선언) static 데이터형 변수명;
	static int i;
	static char c;
	static boolean b;
	static double d;
	static static_v sv;
	
	public static void main(String[] args) {
		//default value
		System.out.println("정수 : "+static_v.i);
		System.out.println("정수 : "+static_v.i);
		System.out.println("문자 : "+static_v.c+(int)static_v.c);
		System.out.println("불린 : "+static_v.b);
		System.out.println("실수 : "+static_v.d);
		System.out.println("객체 : "+static_v.sv);
		
		//2.값할당) 클래스명.변수명 = 값;
		static_v.i=100;
		
		//3. 값 사용) 클래스명. 변수명
		System.out.println(static_v.i);
		
		//모든 객체가 하나의 변수를 사용한다.
		//1.객체화
		static_v instance = new static_v();
		static_v instance2 = new static_v();
		
		//두 객체는 주소가 다르므로 별개의 객체이다.
		System.out.println(instance);
		System.out.println(instance2);
		
	}

}
