package Lec_17;

public class String_demo1 {
	public static void main(String[] args) {
		String str1 = new String("PPPP");
		String str2 = new String("PPPP");

		System.out.println(str1 == str2);// compare add

		System.out.println(str1.equals(str2));// compare content

		String str3 = "PPPP";
		String str4 = "PPPP";
		System.out.println(str3 == str4);// compare add
		System.out.println(str3.equals(str4));// compare content
		
		System.out.println(str1.substring(0));

	}
}
