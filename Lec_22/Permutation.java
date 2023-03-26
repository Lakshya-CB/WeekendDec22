package Lec_22;

public class Permutation {
	public static void main(String[] args) {
		int n = 3;
		boolean[] Visited = new boolean[n];
		solve(n, 2, "", Visited);
	}

	public static void solve(int n, int r, String path, boolean[] Visited) {
		if (r == 0) {
			System.out.println(path);
			return;
		}
		for (int i = 0; i < n; i++) {
//			i the seat!!
			if (Visited[i] == false) {
				Visited[i] = true;
				solve(n, r - 1, path + "B" + i, Visited);
				Visited[i] = false;
			}
		}
	}
}
