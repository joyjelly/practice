package method;

/**
 * static method 작성
 */
public class static_method {
	public static void plus(int num, int num2) {
		int result = 0;
		result = num+num2;
		System.out.println(result);
	}//plus
	public static void gugudan(int dan) {
//		int dan; parameter 와 동일한 변수는 선언할 수 없음 = 영역이 같기에
		if(dan>1&& dan<10) {
			for(int i=1;i<10;i++) {
				System.out.println(dan+"X"+i+" = "+dan*i);
			}
		}
	}
public static void main(String[] args) {
	//객체화 없이 바로 호출 가능
		static_method.plus(2, 0);
		static_method.gugudan(3);
		
}
}