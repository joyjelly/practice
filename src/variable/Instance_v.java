package variable;

/**
 * instance variable
 * - 객체마다 생성되고,사용되는 변수(값을 따로 사용할 수 있다.)
 * - instance화 하면 메모리에 올라가고, 객체사용이 종료되면 메모리에서 내려온다.
 * - 자동 초기화가 된다.(직접 사용하더라도 error를 발생시키지 않는다.)
 * - 꼭 instance 화 후에 사용되어야 한다.(동일 영역에서는 객체명을 생략하고 사용할 수 있다.)
 */
public class Instance_v {
//접근지정자 사용 가능
	int i;
	
	// 초기값(default value)
	int a ;
	char b;
	boolean c;
	double d;
	String s;
	public void test() {
		i=10;
		//동일영역 (instance 영역) 에서는 객체명 없이 사용할 수 있다.
	}
	
	public static void main(String[] args) {
		//영역이 다르면 (static 영역) 객체화 후 사용해야한다. i=10->error
		//객체화 -instance 변수를 사용하기 위해서.
		//클래스명 객체명 = new 클래스명();
		//i 라는 변수를 사용하기 위해 클래스를 객체화 한다.
		Instance_v iv = new Instance_v();
		Instance_v iv2 = new Instance_v();
		System.out.println(iv.i);
		//instance Variable은 특정 객체가 생성되면 만들어지는 변수(member Variable)
		//특정 객체만 사용하는 변수
		iv.i=2;
		iv2.i=23;
		
		//객체가 다르기 때문에 객체마다 다른 값을 가지게 된다.(static 번수와의 차별점)
		System.out.println("iv 객체가 가진 i 변수 :"+iv.i);
		System.out.println("iv2 객체가 가진 i 변수 :"+iv2.i);
		
		System.out.println("기본형");
		System.out.println("정수 :"+iv.a);
		System.out.println("문자 : ["+iv.b+"]");
		System.out.println("실수 :"+iv.d);
		System.out.println("불린 :"+iv.c);
		
		
	}

}
