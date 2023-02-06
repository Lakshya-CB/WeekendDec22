package Lec_08;

public class Rotation {
	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40 };
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
		if(r<0) {
			r = r+arr.length;
		}
		for (int rot = 1; rot <= r; rot++) {
			int ali = arr[arr.length - 1];
			for (int i = arr.length - 2; i >= 0; i--) {
				arr[i + 1] = arr[i];
			}
			arr[0] = ali;
			print(arr);
		}
		
	}
}
