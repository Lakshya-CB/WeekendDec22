package Lec_13;

public class Arrays_2 {
	public static void main(String[] args) {
		int[] arr = new int[10];
		for (int idx = 0; idx < arr.length; idx++) {
			arr[idx] = 10 * (idx + 1);
		}
		for (int idx = 0; idx < arr.length; idx++) {
			System.out.print(arr[idx] + " ");
		}
		System.out.println();
		
		for(int aloo : arr) {
			System.out.print(aloo+ " ");
			aloo = 99;
			System.out.println(aloo);
		}
		System.out.println("==========");
		for (int idx = 0; idx < arr.length; idx++) {
			System.out.print(arr[idx] + " ");
		}
		System.out.println();
		

	}
}
