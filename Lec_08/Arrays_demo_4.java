package Lec_08;

public class Arrays_demo_4 {
	public static void main(String[] args) {
		int[] a1 = { 1, 2, 3, 4 };
		int[] a2 = { 23, 12, 14, 7 };
		System.out.println(a1[0] + " - " + a2[0]);
		swap_arr(a1, a2);
		System.out.println(a1[0] + " - " + a2[0]);
	}

	public static void swap_arr(int[] a, int[] b) {
		System.out.println(a[0] + " - " + b[0]);
		int[] d = a;
		a = b;
		b = d;
		System.out.println(a[0] + " - " + b[0]);

	}

}
