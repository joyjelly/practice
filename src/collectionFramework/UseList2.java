package collectionFramework;

import java.util.ArrayList;
import java.util.List;

/**
 * ArrayList, Vector의 사용
 */
public class UseList2 {
	
	/**
	 * 동기화 처리가 되어있지 않으므로 여러 객체가 동시에 접근 가능. 
	 * Vector보다 속도가 빠름.
	 */
	public void useArrayList() {
		//1. 생성
		List<String> list = new ArrayList<String>();
		//2.값 할당 ) 객체명.add (값); 방의 크기가 증가(가변길이형)
		list.add("Java");
		list.add("Oracle");
		list.add("JDBC");
		list.add("Java");
		list.add("HTML");
		list.add("CSS");
		
		//2번째 방 위치(JDBC) 에 "자바"를 추가(기존 요소 사이에 추가) =>효율이 떨어진다.
		list.add(2,"자바");
		
		//3.크기
		System.out.println(list.size() + " 개");
		
		//배열로 복사
		//1.리스트의 크기대로 빈 배열을 생성
		String[] arr = new String[list.size()];
		//2.복사
		list.toArray(arr);
		
		//3. 모든 방의 값의 출력
		for(String value : arr) {
			System.out.println(value);
		}//end for
		System.out.println("----------------------------------");
		//4.값 삭제 remove(인덱스), remove(요소의 값) 크기가 준다.
		list.remove("Java");
		list.clear();
		list.toArray(arr);
		for(String value : arr) {
			System.out.println(value);
		}//end for
		
	}

	public static void main(String[] args) {
		UseList2 ul = new UseList2();
		ul.useArrayList();
	}

}
