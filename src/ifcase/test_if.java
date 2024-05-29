package ifcase;

/**
 * 단일 if) 조건에 맞을때만 코드를 실행해야 하는 경우
 * 문법)
 * if(조건식){
 *  조건에 맞을 때 수행할 문장들...
 * }
 */
public class test_if {

	public static void main(String[] args) {
		//main method에 처음 입력된 arguments에 입력된 수의 절대값을 구하여 출력 -> args[0]
//		int num = -12;
		
		int num = Integer.parseInt(args[0]);
		int abs = num;
		if(num<0) {//num 이 음수라면 if를 타서 양수로 변환.
			abs =-num;
		}//end if
		
		System.out.println("num의 절대값 :"+abs);
		
		//문자열의 비교 ->같은지만 비교가능,
		//관계연산자 X equals method 사용
		
		System.out.println("equals 문자열의 비교 : "+ args[0].equals("-20"));
		//main method에 두번째 입력된 arg는 성별이다.
		//이때, 여자인 경우에는 "수건 2장 지급"> 목욕탕 입실의 순서로 출력되도록.
		if("남자".equals(args[1])||"여자".equals(args[1])) {
			System.out.println(args[1]+"성별이 입력되었습니다.");
			System.out.println("출입문 입장.");
			if(args[1].equals("여자")) {
				System.out.println("수건 두장 지급.");
			}
			System.out.println("목욕탕 입실.");
		}else {
			System.out.println("성별을 입력하세요.");
		}
		//실수의 비교
		//사람이 활동하기 좋은 날씨는 25.0~ 30.0도 이다. 
		//이 온도일때만"좋은 날씨 입니다. ~(^^~)(~^^)~"를 출력
		double temp =25;
		
		if(temp>=25.0 && temp<=30.0) {
			System.out.println("좋은 날씨 입니다. ~(^^~)(~^^)~");
		}
		//문자의 비교
		//char 의 변수에는 임의의 문자가 들어있다. 해당 문자가 대문자 일 때만 "대문자"를 출력
		char a ='D';
		
		if(a>= 65 && a <= 90) {
			System.out.println(a+"는 대문자입니다.");
		}
		
		
	}

}
