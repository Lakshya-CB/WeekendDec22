package Lec_24;

import java.util.Arrays;

public class Merge_soooooooooooort {
	public static void main(String[] args) {
		int[] arr1 = { 10, 20, 30, 40, 50 };
		int[] arr2 = { 5, 11, 13, 99 };
		System.out.println(Arrays.toString(merge(arr1, arr2)));
	}

	public static int[] sort(int[] arr, int s, int e) {
		if(s==e) {
			int[] ans = new int[1];
			ans[0] = arr[s];
			return ans;
		}
		int mid = (s + e) / 2;
		int[] sp1 = sort(arr, s, mid);
		int[] sp2 = sort(arr, mid + 1, e);
		return merge(sp1,sp2);

	}

	public static int[] merge(int[] arr1, int[] arr2) {
		int[] ans = new int[arr1.length + arr2.length];
		int idx1 = 0;
		int idx2 = 0;

		int i = 0;
		while (idx1 < arr1.length && idx2 < arr2.length) {
			if (arr1[idx1] <= arr2[idx2]) {
				ans[i] = arr1[idx1];
				i++;
				idx1++;
			} else {
				ans[i] = arr2[idx2];
				i++;
				idx2++;
			}
		}
		while (idx1 < arr1.length) {
			ans[i] = arr1[idx1];
			i++;
			idx1++;
		}
		while (idx2 < arr2.length) {
			ans[i] = arr2[idx2];
			i++;
			idx2++;
		}
		return ans;
	}
}
