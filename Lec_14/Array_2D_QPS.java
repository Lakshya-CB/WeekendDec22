package Lec_14;

public class Array_2D_QPS {
	public static void main(String[] args) {
		int[][] arr =  { {10, 20, 30, 40},
                {15, 30, 35, 45},
                {27, 30, 37, 48},
                {29, 30, 39, 50}};
		System.out.println(find(arr, 37));
		
	}

	public static void basic() {
		int[][] mat = new int[5][5];
		int num = 1;
		for (int r = 0; r < mat.length; r++) {
			for (int c = 0; c < mat[0].length; c++) {
				mat[r][c] = num;
				num++;
			}
		}
		for (int[] row : mat) {
			for (int ali : row) {
				System.out.print(ali + " ");
			}
			System.out.println();
		}
	}

	public static void spiral(int[][] arr) {
		int rs = 0;
		int re = arr.length - 1;
		int cs = 0;
		int ce = arr[0].length - 1;
		int cnt = 0;
		int maax = arr.length * arr[0].length;
		while (cnt < maax) {
			for (int r = rs; r <= re && cnt < maax; r++) {
				System.out.print(arr[r][cs] + " ");
				cnt++;
			}
			System.out.println();
			for (int c = cs + 1; c <= ce && cnt < maax; c++) {
				System.out.print(arr[re][c] + " ");
				cnt++;
			}
			System.out.println();
			for (int r = re - 1; r >= rs && cnt < maax; r--) {
				System.out.print(arr[r][ce] + " ");
				cnt++;
			}
			System.out.println();
			for (int c = ce - 1; c >= cs + 1 && cnt < maax; c--) {
				System.out.print(arr[rs][c] + " ");
				cnt++;
			}
			System.out.println();

			rs++;
			re--;
			cs++;
			ce--;
		}
	}

	public static boolean find(int[][] mat, int ali) {
		int r = mat.length - 1;
		int c = 0;
		while (r >= 0 && c < mat[0].length) {
			System.out.println(mat[r][c]);
			if (mat[r][c] == ali) {
				return true;
			} else if (ali > mat[r][c]) {
				c++;
			} else {
				r--;
			}
		}
		return false;
	}
	
}
