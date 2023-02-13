package Lec_09_Ex;

import java.util.Scanner;

public class ANy_to_any {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		int sb = scn.nextInt();
		int db = scn.nextInt();
		int num = scn.nextInt();

//		System.out.println(base10(num, sb));
		long num10 = base10(num, sb);
		System.out.println(base_db(num10, db));
	}

	public static long base_db(long num, int db) {
		long ans = 0;
		long mult = 1;
		while (num > 0) {
			long digit = num % db;
			ans = ans + digit * mult;
			num = num / db;
			mult = mult * 10;
		}
		return ans;

	}

	public static long base10(int num, int sb) {
		long ans = 0;
		long mult = 1;
		while (num > 0) {
			int digit = num % 10;
			ans = ans + digit * mult;

			num = num / 10;
			mult = mult * sb;
		}
		return ans;
	}
}
