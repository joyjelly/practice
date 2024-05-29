package ifcase;

/**
 * 다중 if(else~ if): 연관된 여러 조건을 비교할 때 사용문법
 * if(조건식){
 * 조건에 맞을 때 수행할 문장들 ...;
 * }else if(조건식){
 * 조건에 맞을 때 수행할 문장들...;
 * }else{
 * 모든 조건에 맞지 않을 때 수행할 문장들...;
 * }
 */
public class test_elseif {

	public static void main(String[] args) {
	int score =1;
	System.out.print(score+"점은 ");
	if(score <0) {
		System.out.println("0보다 작아서 실패!");
	}else if(score>100) {
		System.out.println("100보다 커서 실패!");
	}else {
		System.out.println("성공");
	}
	
	//char 형의 변수에는 임의의 문자가 할당되어 있다.
	//할당된 문자가 "대문자"인지, "소문자" 인지, "숫자"인지 그렇지 않다면 
	//"영어나 숫자가 아닙니다"를 출력하는 코드를 작성.
	
	char random ='a';
	if(random>=65 &&random<=90) {
		System.out.println("대문자입니다");
	}else if(random>=95 && random<=123) {
		System.out.println("소문자입니다");
		
	}else if(random>47 && random<58) {
		System.out.println("숫자입니다");
		
	}else {
		System.out.println("영어나 숫자가 아닙니다");
	}
		
	}//end main
	
}//class
