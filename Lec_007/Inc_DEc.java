package Lec_13;

import java.util.Scanner;

public class Inc_DEc {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		int prev = Integer.MAX_VALUE;
		boolean isDec = true;
		for (int i = 0; i < N; i++) {
			int curr = scn.nextInt();
			if (curr == prev) {
				System.out.println(false);
				return;
			}
			if (curr > prev && isDec == true) {
				isDec = false;
				
			}
			if (isDec == false && curr < prev) {
				System.out.println(false);
				return;
			}

//			System.out.println(curr + " - " + prev + " - " + isDec);

			prev = curr;
		}
		System.out.println(true);
	}
}
