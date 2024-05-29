package ifcase;

/**
 * switch~case 사용 : 일치하는 정수를 비교할 때 사용
 * 문법)
 * switch(변수명 ){
 *  case 상수 : 변수가 상수와 일치했을 때 수행할 문장들...;
 *  case 상수 : 변수가 상수와 일치했을 때 수행할 문장들...;
 *  case 상수 : 변수가 상수와 일치했을 때 수행할 문장들...;
 *  
 *  default: 변수와 일치하는 상수가 없을 때 수행 될 문장들...;
 *  }
 */
public class Switch_Case {

	public static void main(String[] args) {
		
		int i =100;
		switch(i) {
		case 0:System.out.println("영");
		break;
		case 1:System.out.println("일");
		break;
		case 2:System.out.println("이"); 
		break;
		case 3:System.out.println("삼");
		break;
		default: System.out.println("변수와 일치하는 상수 없음.");
		
		}//end switch
		/*
		 * 점수에 대한 학점 구하기 -> 범위에 대한 값
		 * A = 90~100
		 * B = 80~89
		 * 
		 */

	}

}
