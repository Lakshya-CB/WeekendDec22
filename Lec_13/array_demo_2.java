package Lec_13_14;

public class array_demo_2 {
	public static void main(String[] args) {
		int[][] mat = new int[10][3];
		for(int[] ali : mat) {
			System.out.println(ali);
		}
		mat[0] = new int[9];
		mat[1] = new int[999];
		mat[2] = new int[99];
		mat[3] = new int[9909];
		System.out.println("================");
		for(int[] ali : mat) {
			System.out.println(ali.length+"--");
		}
	}
}
