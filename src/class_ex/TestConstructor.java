package class_ex;

/**
 * 생성자 연습
 * - 생성자는 직접 호출 불가능 하고, new(객체 생성용 키워드)로만 호출 가능.
 * - 생성자를 반환형 없이, 클래스의 이름과 동일하게 생성. 
 */
public class TestConstructor {
	
	
	/**
	 * 매개변수 없는 기본 생성자!
	 */
	public TestConstructor() {
		System.out.println("default Constructor! 기본 생성자!");
	}//TestConstructor
	public TestConstructor(int i ) {
		System.out.println("Overload 된 Constructor! 생성자의 다형성.");
	}//TestConstructor
	
	public void test() {
		System.out.println("나는 Test Method");
	}	
	
	public void temp() {
		System.out.println("나는 Temp Method");
		test();// 영역이 같을 때에는 객체명 없이 바로, 직접 호출 가능.
		new TestConstructor();
	}

	public static void main(String[] args) { //static 영역
		//생성자 호출
		TestConstructor tc = new TestConstructor();
		tc.temp();//temp()는 인스턴스 영역의 main은 static영역으로 영역이 다르기 때문에
		//static 영역에서 instance영역의 method를 호출하려면 객체화를 하여 호출한다.
		TestConstructor tc2 = new TestConstructor(2024);
		tc2.temp();
		
	}

}
