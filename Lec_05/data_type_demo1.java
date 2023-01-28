package Lec_05;

public class data_type_demo1 {
	public static void main(String[] args) {
		byte b = (byte) 1029; // trunkation
		System.out.println(b);

		short sh = 32767; //
		System.out.println(sh);

		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);

		long l = -100000;// padding!!
		System.out.println(l);

		float f = 10.3f; // f
		double d = 10.3; // default double

	}
}
