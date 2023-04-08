package Lec_25;

import java.util.Arrays;

public class Quick_sort {
	public static void main(String[] args) {

		int[] arr = { 50, 40, 60, 30, 70, 10, 90, 80, 120 };

		Quick(arr, 0, arr.length - 1);
		System.out.println(Arrays.toString(arr));
	}

	public static void Quick(int[] arr, int s, int e) {
		if (s >= e) {
			return;
		}
		int pivot = arr[(s + e) / 2];
		int L = s;
		int R = e;

		while (L <= R) {
			while (arr[L] < pivot) {
				L++;
			}
			while (arr[R] > pivot) {
				R--;
			}
//		swap
			if (L <= R) {
				int temp = arr[L];
				arr[L] = arr[R];
				arr[R] = temp;
				L++;
				R--;
			}
		}
		Quick(arr, s, R);
		Quick(arr, L, e);

	}
}
