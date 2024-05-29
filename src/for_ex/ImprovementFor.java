package for_ex;

/**
 * 개선된 for문
 * 배열, Collection의 처음 방 부터 끝 방까지 순차적으로 출력해야 할 때
 * 문법)
 * for(방의 값을 저장 할 변수의 선언 : 대상){
 * 변수명
 * }
 * 
 */
public class ImprovementFor {

	public static void main(String[] args) {
		int [] arr = {2024,2,5,8,41};
		for(int value : arr) {
			System.out.println(value);
		}
		String [] arr2 = {"루피","쵸파","나미","샹크스","조로","샹디","우솝"};
		for(String name : arr2) {
			System.out.println(name);
		}
	}

}
