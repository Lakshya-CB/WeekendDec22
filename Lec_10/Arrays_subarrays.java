package Lec_10;

public class Arrays_subarrays {
	public static void main(String[] args) {
		int[] arr = { 10, 21, -30, 40, 50 };
		M2(arr);

	}

	public static void M1(int[] arr) {
		int max = arr[0];
		for (int s = 0; s < arr.length; s++) {
			
			for (int e = s; e < arr.length; e++) {
//				System.out.println(s + " - " + e);
				int sum = 0; //B
				for (int i = s; i <= e; i++) {
					System.out.print(arr[i] + " ");
					sum = sum + arr[i];
				}
				System.out.println("=>" + sum);
				if (max < sum) {
					max = sum;
				}
			}
		}
		System.out.println(max);
	}
	public static void M2(int[] arr) {
		int max = arr[0];
		for (int s = 0; s < arr.length; s++) {
			int sum = 0; //B
			for (int e = s; e < arr.length; e++) {
				sum = sum + arr[e];
				
				System.out.println("=>" + sum);
				if (max < sum) {
					max = sum;
				}
			}
		}
		System.out.println(max);
	}
	public static void M3(int[] arr) {
		int sum =0;
		int Max_sum = arr[0];
		for(int ali : arr) {
			sum = sum + ali;
			if(Max_sum< sum ) {
				Max_sum = sum;
			}
			if(sum<0) {
				sum =0;
			}
		}
		System.out.println(sum);
	}
}
