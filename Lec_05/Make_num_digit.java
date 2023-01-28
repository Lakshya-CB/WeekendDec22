package Lec_05;

import java.util.Scanner;

public class Make_num_digit {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();
		long mult = 1;
		long ans = 0;
		while (num > 0) {
			int digit = scn.nextInt();
			ans = ans + digit * mult;
			mult = mult * 10;
			num--;
		}
		System.out.println(ans);
	}
}
