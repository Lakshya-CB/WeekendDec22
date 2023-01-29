package Lec_06;

import java.util.Scanner;

public class Boston {
	public static void main(String[] args) {
//		System.out.println(sumOfDigits(22));
//		System.out.println(sumOfDigits(1234));
		Scanner scn = new Scanner(System.in);
		
		int num = scn.nextInt();
		int sum1 = sumOfDigits(num);
		int sum2 = 0;
		int divi = 2;
		while (num > 1) {
			if (num % divi == 0) {
//				System.out.println(divi);
				sum2 = sum2 + sumOfDigits(divi);
				num = num / divi;
			} else {
				divi++;
			}
		}
//		System.out.println(sum1 + " - " + sum2);
		if(sum1==sum2) {
			System.out.println(1);
		}else {
			System.out.println(0);
		}

	}

	public static int sumOfDigits(int num) {
		int ans = 0;
		while (num > 0) {
			int dogit = num % 10;
			ans = ans + dogit;
			num = num / 10;
		}
		return ans;
	}
}
