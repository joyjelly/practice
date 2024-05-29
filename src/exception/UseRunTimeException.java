package exception;

public class UseRunTimeException {

	public static void main(String[] args) {
		// Main method의 args를 두개 입력받아 나눈 연산을 수행한 후
		// 결과를 보여주는 일

		int num = 0;
		
		int num2 = 0;
		int result = 0;

		try {
			num = Integer.parseInt(args[0]);
			num2 = Integer.parseInt(args[1]);
			result = num / num2;
			System.out.println(result);
		} catch (ArithmeticException ae) {
			System.out.println("영으로 못 나눠유");
		} catch (NumberFormatException nfe) {
			System.err.println("값은 숫자이어야 합니다유.");
		} catch (ArrayIndexOutOfBoundsException aioobe) {
			System.err.println("실행법)java UseRuntimeException 값 값");

		} finally {
			System.out.println("무조건 실행되는 코드에유");
		}
	}

}
