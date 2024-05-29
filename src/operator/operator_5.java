package operator;

/**
 * 논리연산자 일반논리 : 여러개의 관계 연산자를 붙여서 연산할 때 사용. &&( AND ) -전항과 후항이 모두 true 일 때만 true
 * 반환 || (OR) - 전항과 후항이 모두 false 일 때만 false 반환.
 * 
 */
public class operator_5 {
	public static void main(String[] args) {
		boolean flag1 = true;
		boolean flag2 = false;
		boolean flag3 = true;
		boolean flag4 = false;
		System.out.println("--------------AND-----------------");
		System.out.println(flag1 + " && " + flag3 + " = " + (flag1 && flag3));
		System.out.println(flag1 + " && " + flag2 + " = " + (flag1 && flag2));
		System.out.println(flag2 + " && " + flag3 + " = " + (flag2 && flag3));
		System.out.println(flag2 + " && " + flag4 + " = " + (flag1 && flag4));

		System.out.println("--------------OR-----------------");
		System.out.println(flag1 + "||" + flag3 + " = " + (flag1 || flag3));
		System.out.println(flag1 + "||" + flag2 + " = " + (flag1 || flag2));
		System.out.println(flag2 + "||" + flag3 + " = " + (flag2 || flag3));
		System.out.println(flag2 + "||" + flag3 + " = " + (flag2 || flag3));
		System.out.println(flag2 + "||" + flag4 + " = " + (flag2 || flag4));

		// &&: 전항이 false라면 후항을 연산하지 않는다.
		// ||: 전항이 true라면 후항을 연산하지 않는다.

		flag1 = false;
		flag2 = false;
		flag3 = false;

		flag3 = (flag1 = 3 < 2) && (flag2 = 5 < 6);
		// flag1 = false, flag2 =true이지만 전항이 이미 false 이기에 계산하지
		// 않고 넘어감.
		System.out.println(flag1 + "&&" + flag2 + " = " + flag3);

		System.out.println();

		flag1 = false;
		flag2 = false;
		flag3 = false;
		flag3 = (flag1 = 3 > 2) || (flag2 = 5 < 6);
		// flag 1 =true, flag2 =true이지만 이미 전항이 true이기에 후항을 계산하지 않고
		// 넘어감.
		System.out.println(flag1 + "&&" + flag2 + " = " + flag3);

	}
}
