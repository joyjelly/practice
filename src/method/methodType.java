package method;

public class methodType {

	/**
	 * 고정 일: 반환형 없고, void, 매개변수 없는 형
	 */
	public void typeA() {
		System.out.println("고정 일");

	}// typeA

	/**
	 * 가변일
	 */
	public void typeB(int i) {
		System.out.println("가변일 :" + i);
	}// typeB

	/**
	 * 고정 값: 반환형이 있고, 매개변수 없는 형 반드시, method의 가장 마지막 줄에 return이 나와야 한다.
	 */
	public int typeC() {
		int i = 2024;
		return i;
	}//typeC

	/**
	 * 가변값 : 반환형이 있고, 매개변수 있는 형.
	 */
	public int typeD(double d) {
		
		return (int) d;
	}//typeD

	public static void main(String[] args) {
		methodType a =new methodType();
		//객체화 : 인스턴스 변수나 인스턴스 메서드를 사용하기 위해서
		//객체명.이름 = 변수
		//(); => method 기호. 변수와 method구분한다.
		
		//고정일 method - 여러번 호출해도 같은 일 한다.
		a.typeA();
		
		//가변일 method - 외부값 arguments 에 대해 다른 일을 수행한다.
		a.typeB(0);
		a.typeB(1);
		a.typeB(8);
		
		//고정값: 반환형에 일치하는 데이터 형으로 변수를 만들고 반환값을 저장하여 사용한다.
		int c =a.typeC();
		System.out.println("고정 값 : "+c);

		//가변 값 : 반환형에 일치하는 데이터형으로 변수를 만들고, 반환값을 저장하여 사용한다.
		int i = a.typeD(2024.01);
		System.out.println("가변값 : "+i);
		i = a.typeD(2.23);
		System.out.println("가변값 : "+i);
		
		
	}

}
