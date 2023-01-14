package Lec_02;

import java.util.Scanner;

public class Prime {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();
		int divisor = 1;
		int num_factors = 0;
		while (divisor <= num) {
			int rem = num % divisor;
			System.out.println(divisor + " , " + rem);
			if (rem == 0) {
				num_factors = num_factors + 1;
			}
			divisor = divisor + 1;
		}
		System.out.println(num_factors);
		if (num_factors == 2) {
			System.out.println("prime hein bhai");
		} else {
			System.out.println("nahi hein prime!");
		}
	}
}
