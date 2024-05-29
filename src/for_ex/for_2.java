package for_ex;

/**
 * 다중 for: 인덱스를 두 개 사용하여 반복해야 할 때.
 * 문법)
 * for (초기값; 조건식; 증.감소식){
 *     반복수행문장// 단일 for의 영역
 *     for(초기값; 조건식; 증.감소식){
 *     반복수행문장 // 다중 for의 영역
 *     }
 *     반복수행문장// 단일 for의 영역
 *   }
 */
public class for_2 {

	public static void main(String[] args) {
	//다중 for의 동작 : 바깥 for가 한번 반복할 때, 안쪽 for는 몇번 반복하는가?
		for(int i =0; i<5; i++) {
			for(int j=0; j<3;j++) {
				System.out.println(" i :"+i+" , j:"+j);
			}
			System.out.println("---------------------------");
		}//end for
		
		for(int i =2; i<10; i++) {
			System.out.println(i+"단");
			for(int j =1;j<10;j++) {
				System.out.println(i+"X"+j+"="+i*j);
			}
		}
		// 안쪽 for가 0에서부터 시작하여 바깥 for의 현번째까지 반복
		for(int i=0;i<5;i++) {
			for(int j =0;j<=i;j++) {
				System.out.print(i+""+j);
			}
			System.out.println();
		}
		//안쪽 for의 시작이 바깥 for의 큰 지점에서 5까지 반복.
		for(int i =0;i<5;i++) {
			for(int j=i+1;j<6;j++) {
				System.out.print(i+""+j);
			}
			System.out.println();
		}
		System.out.println();
		
		int k =1;
		for(int i =0; i<3;i++) {//0~3
			for(int j =0; j<=i; j++) {//0~i
				System.out.print(k++);//for가 도는만큼 수가 올라간다
				
			}
			System.out.println();
		}
		
		
		
	}//main

}//class
