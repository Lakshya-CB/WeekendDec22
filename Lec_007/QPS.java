package Lec_13;

import java.util.Scanner;

public class QPS {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		Replace_0_5(scn.nextLong());
	}

	public static void Replace_0_5(long num) {
		long mult = 1;
		long ans = 0;
		while (num > 0) {
			long dogit = num % 10;
			if (4 < dogit && num != 9) {
				dogit = dogit - 9;
			}
			ans = ans + mult * dogit;

			mult = mult * 10;
			num = num / 10;
		}
		System.out.println(ans);
	}

}
