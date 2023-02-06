package Lec_08;

public class Rotation_2 {
	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40 ,50};
		solve(arr, 3);
//		System.out.println(-13%4);
	}

	public static void print(int[] arr) {
		for (int ali : arr) {
			System.out.print(ali + " ");
		}
		System.out.println();
	}

	public static void solve(int[] arr, int r) {
		print(arr);
		r = r % arr.length;
		if (r < 0) {
			r = r + arr.length;
		}
		Rev(arr, 0, arr.length-1); // step 1
		print(arr);
		Rev(arr, 0, r-1);
		print(arr);
		Rev(arr, r, arr.length-1);
		print(arr);
	}

	public static void Rev(int[] arr, int L, int R) {
//	int L = 0;
//	int R = arr.length-1;
		while (L < R) {
//		L and R swap!!
			int temp = arr[L];
			arr[L] = arr[R];
			arr[R] = temp;
			L++;
			R--;
		}
	}
}
