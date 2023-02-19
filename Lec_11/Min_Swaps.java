package Lec_11;

import java.util.Scanner;

public class Min_Swaps {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int[] arr = new int[scn.nextInt()];
		for(int i=0;i<arr.length;i++) {
			arr[i] = scn.nextInt();
		}
		selection(arr);
	}

	public static void selection(int[] arr) {
		int ans =0;
		for (int last = arr.length - 1; last >= 1; last--) {
			int max_idx = 0;
			for (int i = 0; i <= last; i++) {
				if (arr[max_idx] < arr[i]) {
					max_idx = i;
				}
			}
			if (last != max_idx) {
				ans++;
				int temp = arr[last];
				arr[last] = arr[max_idx];
				arr[max_idx] = temp;
			}
//			print(arr);
		}
		System.out.println(ans);
	}
}
