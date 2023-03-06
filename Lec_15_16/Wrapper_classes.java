package Lec_15_16;

public class Wrapper_classes {
	public static void main(String[] args) {
		int i = 10;
		System.out.println(i + 10);
		Integer I = 100;
		System.out.println(I);
		System.out.println(I + 10);
		System.out.println("==========");
//		i = I; // unboxing
//		System.out.println(i);
		System.out.println("========");
		I = i; // auto-boxing!!
		System.out.println(I);
				
	}
}
