package class_ex;

public class CallByReference {
	int i;
	int j;
	public void swap(CallByReference cbr) {
		int temp = 0;
		temp = cbr.i;
		cbr.i =cbr.j;
		cbr.j =temp;
		System.out.println("swap method 안 i: "+cbr.i+" , j: "+cbr.j);
	}//swap

	public static void main(String[] args) {
		CallByReference cbr= new CallByReference();
		System.out.println(cbr);
		cbr.i= 2024;
		cbr.j=3;
		System.out.println( "swap method 전 i: "+ cbr.i +
				", j: "+cbr.j);
		cbr.swap(cbr);
		System.out.println( "swap method 후 i: "+ cbr.i +
				", j: "+cbr.j);
	}

}
