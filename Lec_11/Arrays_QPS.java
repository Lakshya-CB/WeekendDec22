package Lec_11;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays_QPS {
	public static void main(String[] args) {
//		int[] arr = { 1, 2, 3, 4, 5 };
//		productItself2(arr);
		Scanner scn = new Scanner(System.in);
		int[] arr = new int[scn.nextInt()];
		for(int i=0;i<arr.length;i++) {
			arr[i] = scn.nextInt();
		}
		productItself2(arr);
	}

	public static void productItself2(int[] arr) {
		long[] P2_arr = new long[arr.length];
		long P2 = 1;
		for (int i2 = arr.length - 1; i2 >= 0; i2--) {
			P2 = P2 * arr[i2];
			P2_arr[i2] = P2;
		}
//		System.out.println(Arrays.toString(P2_arr));

		long P1 = 1;
		for (int i = 0; i < arr.length; i++) {
			if (i > 0) {
				P1 = P1 * arr[i - 1];
			}
			if (i == arr.length - 1) {
				P2 = 1;
			} else {
				P2 = P2_arr[i + 1];
			}
			System.out.print(P1 * P2 + " ");
		}
	}

	public static void productItself(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
//			arr[i]
//			0 to i-1
			long P1 = 1;
			for (int i1 = 0; i1 < i; i1++) {
				P1 = P1 * arr[i1];
			}
//			i+1 to n
			long P2 = 1;
			for (int i2 = arr.length - 1; i2 > i; i2--) {
				P2 = P2 * arr[i2];
			}

			System.out.print(P1 * P2 + " ");
		}
	}
}
