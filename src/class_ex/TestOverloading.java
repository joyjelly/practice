package class_ex;

/**
 * Polymorphism
 * Method overloading : 하나의 클래스 안에서 같은 이름의 method를 여러개 정의하는 것.
 * 
 */
public class TestOverloading {
	//별 하나 출력
	public void printStar() {
		System.out.println("*");
	}
	
	//입력되는 수 만큼 별을 옆으로 출력하는 일
	
	public void printStar(int star) {
		for(int i =0;i<star ;i++) {
			System.out.print("*");
		}
	}

	public static void main(String[] args) {
		TestOverloading st = new TestOverloading();
		st.printStar();
		st.printStar(3);
	}

}
