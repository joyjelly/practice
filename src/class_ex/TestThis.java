package class_ex;

public class TestThis {
	int i;
	int j;
	TestThis t;
	public void setI(int i,TestThis t) {
		t.i =i;
	}
	public void setJ(int j) {
		System.out.println(this+" 번지에서 호출" );
		this.j =j;
	}
	public static void main(String[] args) {
		TestThis t = new TestThis();
		System.out.println(t+" 객체의 주소");
		t.setI(2024,t);
		System.out.println(t.i);
		t.setJ(2024);
		System.out.println(t.j);
		System.out.println("---------------------------------------");
		TestThis t2 = new TestThis();
		System.out.println(t2+"객체의 주소");
		t2.setJ(3);
	}

}
