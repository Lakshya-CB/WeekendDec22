package Lec_11;

public class Rainpaani {
	public static void main(String[] args) {

	}

	public static int trap2(int[] arr) {
		int paani = 0;
		int[] Right_arr  = new int[arr.length];
		int Right = arr[arr.length-1];
		for(int i=arr.length-1;i>=0;i--) {
			Right = Math.max(Right, arr[i]);
			Right_arr[i]= Right;
		}
		
		int Left = arr[0];

		for (int buck = 1; buck <= arr.length - 2; buck++) {

			Left = Math.max(Left, arr[buck]);

			Right = Right_arr[buck];
			
			paani = paani + Math.min(Left, Right) - arr[buck];
		}
		return paani;
	}

	public static int trap(int[] arr) {
		int paani = 0;
		for (int buck = 1; buck <= arr.length - 2; buck++) {
//			buck
			int Left = arr[buck];
			for (int i = 0; i <= buck; i++) {
				Left = Math.max(Left, arr[i]);
			}

			int Right = arr[buck];
			for (int i = buck; i < arr.length; i++) {
				Right = Math.max(Right, arr[i]);
			}
			paani = paani + Math.min(Left, Right) - arr[buck];
		}
		return paani;
	}
}
