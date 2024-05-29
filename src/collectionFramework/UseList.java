package collectionFramework;

import java.util.ArrayList;
import java.util.List;


/**
 * 모든 JDK 버전에서는 generic 없이 List를 생성하고 사용할 수 있다.
 */
public class UseList {
	@SuppressWarnings("unchecked")
	public UseList() {
		//1.생성 - generic을 사용하지 않고 생성 => 모든 값을 추가 할 수 있다.
		List list = new ArrayList();
		//2. 값 할당
		list.add(100);
		list.add(200);
		list.add(300);
		list.add(400);
		list.add(3.06);
		list.add("안녕하세요?");
		list.add(true);
		
		//3.값 얻기
		for (int i =0; i<list.size();i++) {
			//사용하는 쪽에서 에러가 날 수 있다.
			System.out.println(list.get(i));
		}//end for
		System.out.println(list + " / "+ list.size());
		
		
		System.out.println("----------------------------------------------------------------");
		//generic의 사용 : 입력 데이터형을 제한한다.
		 List<Integer> list2 = new ArrayList<Integer>();
		 //값 할당
		 list2.add(2024);
		 list2.add(3);
		 list2.add(6);
		 list2.add(11);
		 list2.add(5);
		 //값 얻기
		 for(int value : list2) {
			System.out.print(value+" ,");
		 }
		 System.out.println();
		 System.out.println("----------------------------------------------------------------");
		 
		 for(int i =0; i<list2.size();i++) {
			 System.out.print(list2.get(i)*10+" ,");
		 }//end for
		 
		
	}//useList
	public static void main(String[] args) {
		new UseList();
	}
}//class

