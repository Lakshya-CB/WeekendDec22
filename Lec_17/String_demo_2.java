package Lec_17;

public class String_demo_2 {
	public static void main(String[] args) {
		String str = "baabuu";

		String ll2 = str.substring(3);
//		ll2=ll2.intern();
		String lll = "buu";
		System.out.println(lll==ll2);
		System.out.println(lll.equals(ll2));
	}
}
