package for_ex;

/**
 * 시간과 끝을 모를 때 사용하는 반복문
 * 최소 1번 수행에 최대 조건까지 수행
 * 문법)
 * do{
 * 반복 수행 문장들...
 * }while( 조건식 )
 */
public class do_While {

	public static void main(String[] args) {
	int i =0;
	do {
		System.out.println("i = "+i);
		i++;
	}while(i<10);
	//무조선 한번은 탄다.
	
	//1~100까지의 합을 출력.
	int j=1;
	int sum=0;
	
	
	do {
		sum+=j;
		j++;
	}while(j<101);
	System.out.println(sum);
	}//main

}//class
