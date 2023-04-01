package Lec_23;

public class Blocked_maze {
	public static void main(String[] args) {
		int[][] maze={{0,1,0,0},
			  {0,0,0,0},
			  {0,1,0,0},
			  {0,0,1,0}};
		
		solve(0, 0, maze, "",new boolean[maze.length][maze[0].length]);

	}
	public static void solve(int r, int c, int[][] maze,
			String path, boolean[][] Visited) {
		if(r==maze.length-1 && c==maze[0].length-1) {
			System.out.println(path);
			return;
		}
		if(r<0||r==maze.length||c<0||c==maze[0].length
				||maze[r][c]==1||Visited[r][c]) {
			
			return;
		}
//		Visited[r][c] = true;
		maze[r][c] = 1;
		
		solve(r-1, c, maze, path+"U",Visited);
		solve(r+1, c, maze, path+"D",Visited);
		solve(r, c+1, maze, path+"R",Visited);
		solve(r, c-1, maze, path+"L",Visited);
		maze[r][c] = 0;
		
//		Visited[r][c] = false;
		
	}
}
