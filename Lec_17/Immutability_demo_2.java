package Lec_17;

public class Immutability_demo_2 {
	public static void main(String[] args) {
		String str1 = "hello";
		String str2 = str1;
		str1 = str1 + "P";

		System.out.println(str1);
		System.out.println(str2);

	}
}