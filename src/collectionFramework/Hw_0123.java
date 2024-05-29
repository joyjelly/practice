package collectionFramework;

import javax.swing.JOptionPane;

/**
 * 1.입력 데이터가 CSV형태(이름, 자바점수, 오라클점수) 라면 WorkVO객체를 생성하여
 * 입력값을 할당하고 java.util.List에 추가하는 작업을 수행하세요.
 * 
 * 2. CSV 형태가 아닌 "출력"이 입력되면 java.util.List에 들어있는 값을 모두 다 console에 출력
 * 
 * 번호 이름 자바 오라클 총점
 * 1   윤웅찬  100 100 200
 * 2   김병년 95   89   XX
 * 
 * 3.CSV형태가 아닌 Y나 Y가 입력되면 프로그램을 종료한다.
 */
public class Hw_0123 {
	String input_data;
	public void menu() {
		input_data =JOptionPane.showInputDialog
	("\"이름,자바점수,오라클점수\" 입력\n \"출력\"을 입력하면 출력됩니다.\n종료하시려면 Y/y를 입력해주세요.");
				
	}
	public static void main(String[] args) {

	}

}
