package method;

/**
 * instance method
 * - instance variable을 사용하여 업무를 처리해야 할 때
 * - 객체화 후에 객체명으로  method를 호출
 */
public class Instance_method {
	
	int day;//instance variable

	public void printDay() {
		System.out.println(day+"일");
	}
	
	public static void main(String[] args) {
		//TestInstanceMethod.printDay();
		//instance method는 클래스 명으로 호출할 수 없다.
		// 인스턴스 화 후 객체명.method명으로 호출을 한다.
		Instance_method im =new Instance_method();
		im.day= 8; // instance variable의 사용.
		
		//instance method의 호출
		im.printDay();
		im.day++ ;
		im.printDay();
}
}