package Lec_21;

public class Maze_Path {
	public static void main(String[] args) {
		solve(0, 0, 2, 2, "");
	}

	public static void solve(int curr_r, int curr_c, int dest_r, int dest_c, String path) {
//		bp : 0,0

		if (dest_r == curr_r && dest_c == curr_c) {
			System.out.println(path);
			return;
		}
		if(dest_r+1==curr_r||dest_c+1 == curr_c) {
			return;
		}
		solve(curr_r + 1, curr_c, dest_r, dest_c, path + "D");

		solve(curr_r, curr_c + 1, dest_r, dest_c, path + "R");

	}
}
