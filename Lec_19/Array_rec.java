package Lec_19;

public class Array_rec {
	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40 };
		printRev(arr, 0);
	}

	public static void print(int[] arr, int idx) {
//	print(arr,0)
//	print(arr,1)
		if (idx == arr.length) {
			return;
		}
		System.out.println(arr[idx]);
		print(arr, idx + 1);

	}

	public static void printRev(int[] arr, int idx) {
		if (idx == arr.length) {
			return;
		}
//		BP : printRev(arr,0)
//		SP : printRev(arr,1)
		printRev(arr, idx + 1);
		System.out.println(arr[idx]);
	}

	public static int Max(int[] arr, int idx) {
		if (idx == arr.length - 1) {
			return arr[idx];
		}
//		BP : Max(arr,0)
//		SP : Max(arr,1)
		int sp = Max(arr, idx + 1);
		return Math.max(arr[idx], sp);
	}

	public static int FirstOcc(int idx, int[] arr, int ali) {
		if(idx==arr.length) {
			return -1;
		}
		int sp = FirstOcc(idx + 1, arr, ali);
		if (arr[idx] == ali) {
			return idx;
		}
		return sp;
	}
}
