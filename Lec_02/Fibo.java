package Lec_02;

public class Fibo {
	public static void main(String[] args) {
		int n = 6;
		
		int a = 0;
		int b = 1;
		int ct = 1;
		while (ct<= n) {
			int c = a + b;
			a = b;
			b = c;

			ct++;
		}
		System.out.println(a);
	}
}
