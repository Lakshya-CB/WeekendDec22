package Lec_05;

public class data_types_demo2 {
	public static void main(String[] args) {
		char ch = 'a';
		System.out.println(ch);
		System.out.println((int) ch);
		System.out.println(ch + 2);
		ch = ' ';
		System.out.println(ch);
		System.out.println((int) ch);

		System.out.println((char) (ch + 25));

		char ch2 = 'b';
		System.out.println(ch + ch2);
		System.out.println('a' + 2);

		boolean b = 3 < 2+6+'S';
		System.out.println(b);
		while (b) {
			System.out.println("aaag  lagi!!");
		}
		System.out.println(b);
	}
}
