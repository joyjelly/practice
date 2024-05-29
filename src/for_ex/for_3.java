package for_ex;

/**
 * for의 다양한 형태
 * - 무한루프
 * for(초기값 ;;증,감소식){
 * }
 * for(;;){
 * }
 */
public class for_3 {

	public static void main(String[] args) {
	
		//여러개의 초기값을 가진 for
		for(int i =0,j=10,k=100; i<10;i++,j+=100,k--) {
			System.out.println("i: "+i +" j: "+j+" k: "+k);
		}
		
	for(int i =1;i<101;i++) {
		if(i%2==0) {//짝수면 pass~
			continue;
		}
		System.out.print(i+" ");
	}
		
		
	}//main

}//class
