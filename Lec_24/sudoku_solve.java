package Lec_24;

public class sudoku_solve {
	public static void main(String[] args) {
		char[][] board = { { '5', '.', '.', '.', '7', '.', '.', '.', '.' },
				{ '6', '.', '.', '1', '9', '5', '.', '.', '.' }, { '.', '9', '8', '.', '.', '.', '.', '6', '.' },
				{ '8', '.', '.', '.', '6', '.', '.', '.', '3' }, { '4', '.', '.', '8', '.', '3', '.', '.', '1' },
				{ '7', '.', '.', '.', '2', '.', '.', '.', '6' }, { '.', '6', '.', '.', '.', '.', '2', '8', '.' },
				{ '.', '.', '.', '4', '1', '9', '.', '.', '5' }, { '.', '.', '.', '.', '8', '.', '.', '7', '9' } };

		suvel(0, 0, board);
		print(board);
	}

	public static void print(char[][] board) {

		for (char[] row : board) {
			for (char ch : row) {
				System.out.print(ch + " ");
			}
			System.out.println();
		}
	}

	public static void suvel(int r, int c, char[][] board) {
		if (c == 9) {
			r++;
			c = 0;
		}
		if (r == 9) {
			print(board);
			System.out.println("=====================");
			return;

		}
		if (board[r][c] != '.') {
			suvel(r, c + 1, board);
		} else {
			for (char ch = '1'; ch <= '9'; ch++) {
				if (isSafe(board, r, c, ch)) {
					board[r][c] = ch;
					suvel(r, c + 1, board);
				}
			}
			board[r][c] = '.';

		}
	}

	public static boolean isSafe(char[][] board, int r, int c, char ch) {
		for(int row = 0;row<9;row++) {
			if(board[row][c]==ch) {
				return false;
			}
		}
		for(int col = 0;col<9;col++) {
			if(board[r][col]==ch) {
				return false;
			}
		}
		int box_row = r/3;
		int box_col = c/3;
		for(int row = box_row*3;row<box_row*3+3;row++) {
			for(int col = box_col*3;col<box_col*3+3;col++) {
				if(board[row][col]==ch) {
					return false;
				}
			}
		}
		
		return true;
	}
}
