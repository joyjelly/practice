package for_ex;

/**
 * for문 : 시작과 끝을 알 때 사용하는 반복문.
 * 문법)
 * for (시작값;조건식 (끝 값); 증.감소식){
 * 반복 수행 될 문장들...;
 * }
 */
public class for_1 {

	public static void main(String[] args) {
		for(int i =0; i<10;i++) {
			System.out.println("안녕하세요 "+i);
		}//end for
		System.out.println();
		
		//1에서 100까지 옆으로 출력하는 코드 작성
		for(int i =1;i<101;i++) {
			System.out.print(i+" , ");
		}//end for
		System.out.println();
		
		//1에서부터 100까지 홀수만 옆으로 출력하는 코드 작성.
		//증감식은 대상체의 값을 변화시키고 저장할 수 있는 모든 연산자를 사용할 수 있다.
		for(int i =0; i<50;i++) {
			System.out.print((i*2)+1+",");
		}//end for
		
		System.out.println();
		
		//100에서부터 1까지 출력하는 코드를 작성
		for(int i =100; i>0;i--) {
			System.out.print(i+" ");
		}//end for
		System.out.println();
		
		//main method에서 처음 입력된 값이 구구단의 범위였을때, (2~9)
		//해당 단의 구구단을 출력하는 코드 작성.
		int gugudan = Integer.parseInt(args[0]);
		if((gugudan>1)&& (gugudan<10)) {
		System.out.println(gugudan+"단 =");
		for(int i =1;i<10;i++) {
			System.out.println(gugudan+"*"+ i+" = "+ gugudan*i);
		}
		}else {
			System.out.println("유효한 수를 입력하세요. 2~9");
		}
		//1에서부터 100까지 합을 출력. 5050
		
		int sum= 0;//누적합을 하기 위한 변수
		for (int i =0;i<101;i++) {
			sum += i;
		}
		System.out.println(sum);
		
		System.out.println("--------------------------------------");
		
		for(int i =2;i<10;i++) {
			for(int j =1;j<10;j++) {
				System.out.println(i+"*"+j+ " = "+ i*j);
			}
			System.out.println();//단이 끝날때 마다 줄 바꿈
			System.out.println();
		}
		
		
		
	}//main

}//class
