package collectionFramework;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class UseSet {
	public UseSet() {
		//1.생성
		Set<String> set = new HashSet<String>();
		//2. 값 할당 - 입력되는 값은 순차적으로 입력되지 않는다.
		
		set.add("루피");
		set.add("쵸파");
		set.add("조로");
		set.add("나미");
		set.add("에이스");
		set.add("윤웅찬");
		set.add("김병년");
		
		//중복값은 적용X
		set.add("루피");
		set.add("나미");
		
		//배열로 복사
		//2. set의 크기만큼 빈 배열을 생성
		String[] arr = new String[set.size()];
		//set의 내용을  arr로 복사.
		set.toArray(arr);
		
		for(String values : arr) {
			System.out.println(values);
		}//end for
		System.out.println("---------------iterator 검색---------------------");
		//검색 -> Iterator 사용.
		//1.iterator에 제어권 할당.
		Iterator<String> ita = set.iterator();
		//2.다음 요소거 존재하는지 판단.
		String temp ="";
		while(ita.hasNext()) {
			temp = ita.next();
			System.out.println(temp);
		}//end while
		
		System.out.println("---------------iterator 검색---------------------");
		while(ita.hasNext()) {
			temp = ita.next();
			System.out.println(temp);
		}//end while
		System.out.println(set+ " / "+ set.size());
		
		
		
	}//UseSet
	
	

	public static void main(String[] args) {
		UseSet us = new UseSet();
	}

}
