package operator;

/**
 * 삼항(조건) 연산자 조건식 " 항1 : 항2
 */
public class operator_6 {
	public static void main(String[] args) {
		int num = 2;
		System.out.println(num + "은(는)" + (num >= 0 ? "양수" : "음수"));
		System.out.println();

		// num이 짝수인지 음수인지 확인해서 출력하는 코드
		num = 11;
		System.out.println(num + "은(는)" + (num % 2 == 0 ? "짝수" : "홀수"));
		//점수를 저장하는 변수를 선언하고, 임의의 값을 할당.
		//할당된 값이 0~100 사이라면 "유효점수" 를 출력하고, 그렇지 않다면 "무효점수"를 출력하는 코드.
		int score = 101;
		System.out.println(score +"은(는)"+ ((0<= score) &&(score<=100)? "유효점수":"무효점수"));
		
	}
}
