package Lec_13_14;

public class array_2D {
	public static void main(String[] args) {
		int[][] mat = new int[3][5];
		
		
		System.out.println(mat);
		System.out.println(mat.length);
		
		for(int[] ali : mat) {
			System.out.println(ali);
		}
		
		System.out.println("================");
		
		for(int[] row : mat) {
//			for(int ali : row) {
//				System.out.print(ali+ " ");
//			}
//			System.out.println();
			for(int i=0;i<row.length;i++) {
				System.out.print(row[i]+ " ");
				 
			}
			System.out.println();
		}
		System.out.println("--------");
		System.out.println(mat[0][0]);
		System.out.println(mat[0][1]);
		System.out.println(mat[0][2]);
		System.out.println(mat[0][3]);
		System.out.println(mat[0][4]);
		
		
	}
}
