package collectionFramework;

import java.util.ArrayList;
import java.util.List;

public class List1 {
	public List1() {
		//1.생성 generic을 사용하지 않고 생성 -> 모든 걊알 추가할 수 있다.
		List list = new ArrayList();
		
		//2.값 할당
		list.add(100);
		list.add(200);
		list.add(300);
		list.add(300);
		list.add(1.23);//
		list.add("안녕하세요?");
		list.add(true);
		
		//값 얻기
		for(int i =0; i<list.size();i++) {
			//사용하는 쪽에서 에러가 날 수 있다.
			System.out.println(list.get(i));
		}//end for
		System.out.println(list + " / "+ list.size());
		
		System.out.println("-----------------------------------------------------");
		//Generic의 사용 : 입력데이터형을 제한한다.
		List<Integer> list2 = new ArrayList<Integer>();
		
		list2.add(2024);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
