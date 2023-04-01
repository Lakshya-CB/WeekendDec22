package Lec_23;

public class Queen_Q {
	public static void main(String[] args) {
		int n = 4;
		boolean[][] board = new boolean[n][n];
		comb2D(n, 0, 0, n, "", board);
	}

	public static void print(boolean[][] board) {
		for (boolean[] row : board) {
			for (boolean b : row) {
				if (b) {
					System.out.print("/");
				} else {
					System.out.print(".");
				}
			}
			System.out.println();
		}

	}

	public static void comb2D(int n, int r, int c, int QTP, String path, boolean[][] board) {
		if (QTP == 0) {// +ve BC
			System.out.println(path);
			print(board);
			System.out.println("=================");
			return;
		}

		if (c == n) {
			r++;
			c = 0;
		}
		if (r == n) {// -ve BC
			return;
		}
		if (isSafe(board, r, c)) {
			board[r][c] = true;
			comb2D(n, r, c + 1, QTP - 1, path + "Q{" + r + "," + c + "}", board);
			board[r][c] = false;
		}
		comb2D(n, r, c + 1, QTP, path, board);
	}

	private static boolean isSafe(boolean[][] board, int r, int c) {
		for(int row = 0;row<r;row++) {
			if(board[row][c]) {
				return false;
			}
		}
		for(int col = 0;col<c;col++) {
			if(board[r][col]) {
				return false;
			}
		}
		int r1= r;
		int c1 = c;
		while(r1>=0 && c1>=0) {
			if(board[r1][c1]) {
				return false;
			}
			r1--;c1--;
		}
		
		int r2= r;
		int c2 = c;
		while(r2>=0 && c2<board[0].length) {
			if(board[r2][c2]) {
				return false;
			}
			r2--;c2++;
		}
		return true;
	}
}
