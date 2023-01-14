package Lec_03;

public class GCD_2 {
	public static void main(String[] args) {
		int a = 32;
		int b = 18;

		int dividend = a;
		int divisor = b;
		while (divisor>0) {
			int rem = dividend % divisor;
			dividend = divisor;
			divisor = rem;
		}
		System.out.println(dividend);
	}
}
