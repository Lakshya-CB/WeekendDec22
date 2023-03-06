package Lec_15_16;

public class Poly {
	public static void main(String[] args) {
		int n = 3;
		int x = 7;

		int ans = 0;
		int exp = x;
		for (int c = n; c >= 1; c--) {
			ans = ans + c * exp;
			exp = exp * x;
		}
		System.out.println(ans);
	}
}
