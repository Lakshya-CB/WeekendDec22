package Lec_09_Ex;

import java.util.Arrays;

public class soorting {
	public static void main(String[] args) {
//		int[] arr = { 50, 40, 30, 20, 10 };
		int[] arr = { 10, 20, 30, 40, 50, -25 };
		Arrays.sort(arr);
		print(arr);
		
//		Insertion(arr);
//		bubble(arr);
//		int[] arr = {5,7,11,12,15,20,31,33,35,40,45,55,58,66,71};
		System.out.println(find(arr, 20));
//		
	}

	public static void print(int[] arr) {
		for (int ali : arr) {
			System.out.print(ali + " ");
		}
		System.out.println();
	}

	public static void bubble(int[] arr) {
		for (int cnt = 1; cnt < arr.length; cnt++) {
			for (int s = 0; s <= arr.length - 1 - cnt; s++) {
//			s and s +1;
				if (arr[s] > arr[s + 1]) {
					int temp = arr[s];
					arr[s] = arr[s + 1];
					arr[s + 1] = temp;
				}
			}
			print(arr);
		}
	}

	public static void selection(int[] arr) {
		for (int last = arr.length - 1; last >= 1; last--) {
			int max_idx = 0;
			for (int i = 0; i <= last; i++) {
				if (arr[max_idx] < arr[i]) {
					max_idx = i;
				}
			}
			int temp = arr[last];
			arr[last] = arr[max_idx];
			arr[max_idx] = temp;

			print(arr);
		}
	}

	public static void Insertion(int[] arr) {
//		int[] arr = {10,20,30,40,50,25};
		for (int last = 1; last < arr.length; last++) {
			int baack_up = arr[last];
			int idx = last - 1;
			while (idx >= 0 && arr[idx] > baack_up) {
				arr[idx + 1] = arr[idx];
				idx--;
			}
			arr[idx + 1] = baack_up;
			print(arr);
		}
	}

	public static int find(int[] arr, int ali) {
		int s = 0;
		int e = arr.length - 1;
		while (s <= e) {
			int mid = (s + e) / 2;
			if (arr[mid] == ali) {
				return mid;
			} else if (arr[mid] < ali) {
				s = mid + 1;
			} else {
				e = mid - 1;
			}
		}
		return -1;
	}
}
