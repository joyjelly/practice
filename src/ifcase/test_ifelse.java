package ifcase;

/**
 * if~else : 둘 중 하나의 코드를 실행해야 할 때 사용.
 * 문법 )if(조건식){
 * 조건에 맞을 때 사용할 문장들...
 * }else{
 * 조건에 맞기 않을 때 수행할 문장들...}
 */
public class test_ifelse {

	public static void main(String[] args) {
	//임의의 정수가 홀수인지 짝수인지 판단하여 출력하는 코드를 만들어보자.
		int num= 1;
		if(num%2==0) {
			System.out.println("해당 수는 짝수입니다.");
		}else {
			System.out.println("해당 수는 홀수입니다.");
			
		}
		
		//임의의 점수를 저장하는 변수를 만들고, main method의 arg 첫번째를 받아서,
		//0~100사이면 유효점수를 출력하고, 그렇지 않다면 무효점수 출력.
		
		int a =Integer.parseInt(args[0]);
		if(a>=0&& a<=100) {
			System.out.println("유효점수");
		}else {
			System.out.println("무효점수");
			
		}
		
	}

}
