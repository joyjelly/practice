package method;

/**
 * variable Arguments (가변인수 - 파라메터는 하나이나 입력값이 동적)
 * 문법)
 * 데이터형 ...변수명
 */
public class variableArguments {
	public void testVA(int ... i) {
//		파라메터는 참조형 데이터형인 배열로 처리된다.
		for(int j =0; j<i.length;j++) {
			System.out.println(i[j]);
		}
	}
	public static void main(String[] args) {
		variableArguments va =new variableArguments();
		va.testVA(2024);
		va.testVA(2024,1,9,11,43,2,23);
	}

}
