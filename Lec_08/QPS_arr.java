package Lec_08;

public class QPS_arr {
	public static void main(String[] args) {
		int[] arr = {10,22,1,32,4,8};
//		int maxi = Max(arr);
//		System.out.println(maxi);
		print(arr);
		RevArray(arr);
		print(arr);
	}
	public static int Find(int[] arr, int ali) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i] ==ali) {
				return i;
			}
		}
		return -1;
	}
	public static void print(int[] arr) {
		for (int ali : arr) {
			System.out.print(ali + " ");
		}
		System.out.println();
	}

	public static int Max(int[] arr) {
		int jeb = arr[0];
		for (int aam : arr) {
			if (aam > jeb) {
				jeb = aam;
			}
		}
		return jeb;
	}

	public static int[] TenkeTable(int k) {
		int[] arr = new int[k];
		for (int i = 0; i < k; i++) {
			arr[i] = (i + 1) * 10;
		}
		return arr;
	}
	public static void RevPrint(int[] arr) {
		for(int idx= arr.length-1; idx >=0; idx--) {
			System.out.print(arr[idx]+ " ");
		}
		System.out.println();
	}
	public static void RevArray(int[] arr) {
		int L = 0;
		int R = arr.length-1;
		while(L<R) {
//			L and R swap!!
			int temp = arr[L];
			arr[L] = arr[R];
			arr[R] = temp;
			L++;R--;
		}
	}
}
