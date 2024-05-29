package collectionFramework;

import java.util.List;
import java.util.Stack;

/**
 * LIFO
 */
public class UseStack {
	public UseStack() {
		//1. 생성 is a 관계의 객체화는 하지 않는다.
//		List<String> list = new Stack<String>();
		Stack<String> stk = new Stack<String>();
		
		//2. 값 할당 - item
		stk.push("입니다.");
		stk.push("오늘은.");
		stk.push("수요일.");
		
		//3.값 얻기 - pop, 얻어낸 item은 사라진다.
		while(!stk.empty()) {
			System.out.println(stk.pop());
		}//end while
		
		System.out.println(stk.empty());
		
		
	}//useStack
	public static void main(String[] args) {
		new UseStack();
	}

}
