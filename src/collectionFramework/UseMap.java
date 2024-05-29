package collectionFramework;

import java.util.HashMap;
import java.util.Map;

/**
 * 키와 값의 쌍으로 이루어진 데이터형
 */
public class UseMap {
	
	public void useHashTable() {
	//1. Map 생성
	 Map <String, String> map = new HashMap<String, String>();
	//2. map 값 설정 map.put(키, 값) - 순서대로 입력되지 않는다.
	 map.put("A", "세심하다");
	 map.put("B", "성질 드럽다.");
	 map.put("AB", "싸이코");
	 map.put("O", "우유부단");
	 //키가 중복되면 같은 키에 덮어쓴다.
	 map.put("A", "소심하다 ☞(^-^)☜");
	 //키가 다르면 중복값을 허용
	 map.put("a", "소심하다 ☞(^-^)☜");
	 
	 //검색 : 키를 사용하여 값을 검색 map.get(키)
	 String key ="O";
	 String value =map.get(key);//키가 존재하지 않으면 null 값을 반환.
	 
	 //map에 키가 존재하는지?
	 System.out.println(map.containsKey("b"));
	 
	 
	 boolean flag = map.containsKey(key);
	 
	 if(flag) {
		 System.out.println(key+"의 특징은 : "+value);
	 }else {
		 System.out.println(key +"에 대한 값은 준비되어있지 않습니다.");
	 }//end if
	 
	 //값 삭제
	 map.remove("a");
	 map.clear();
	 
	 System.out.println(map.isEmpty());
	 System.out.println(map);
	 
	 
	 
	 
	 
	}

	public static void main(String[] args) {
		UseMap um = new UseMap();
		um.useHashTable();
	}

}
