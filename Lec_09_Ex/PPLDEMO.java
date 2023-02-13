package Lec_09_Ex;

public class PPLDEMO {
	public static void main(String[] args) {
//		System.out.println(checl());
		int[] arr = checl();
		for(int ali : arr) {
			System.out.print(ali+ " ");
		}
	}

	public static int[] checl() {
		int[] arr = new int[2];
		arr[0] = 99;
		arr[1] = 10;
		return arr;
	}
}
