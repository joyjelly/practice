package for_ex;

/**
 * 시간과 끝을 모를 때 사용하는 반복문
 * 최소 0번 수행에 최대 조건까지 수행
 * 문법)
 * while( 조건식 ){
 * 반복수행 문장들...;
 * }
 */
public class while_ {

	public static void main(String[] args) {
	int i =0;
	while(i<10) {// 조건식
		System.out.println("i ="+i);//반복수행 문장들
		i++; //증,감소식
	}
	System.out.println();
	System.out.println();
	//구구단 5단 출력
	int j=1;
	while(j<10) {
		System.out.println(5+" * "+j+" = "+5*j);
		j++;
	}
	
	}//main

}//class
