package eventClass;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * WindowAdapter는 abstract method가 존재하지 않는 추상 클래스.
 * 자식클래스에서 반드시 Override 해야 할 method가 없다.
 * 개발자가 필요로 하는 method만 Override 하면 된다.
 */
public class WindowAdapterSub extends WindowAdapter {
	//WindowAdapterSub와 TestWindowEvent2는 has a 관계
	private TestWindowEvent2 twe;
	
	//null인 twe에 주소를 할당하기 위해 생성자에 매개변수를 선언.
	public WindowAdapterSub(TestWindowEvent2 twe) {
		this.twe = twe;
	}
	
	
	
	
	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		super.windowClosing(e);
	}




	public static void main(String[] args) {

	}

}
