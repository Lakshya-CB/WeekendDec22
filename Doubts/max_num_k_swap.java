package Doubts;

import java.util.Arrays;

public class max_num_k_swap {
	public static void main(String[] args) {
		int[] arr = {6,2,3,1};
		solve(arr, 2);
	}

	public static void solve(int[] arr, int k) {
		System.out.println(Arrays.toString(arr));
		
		if(k==0) {
			return;
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				swap(arr, i, j);
				solve(arr, k-1);
				swap(arr, i, j);
			}
		}
	}

	public static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	
	}
}
