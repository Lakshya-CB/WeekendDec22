package Lec_23;

public class Combination {
	public static void main(String[] args) {

//		comb(4, 2, -1, "");
//		combU(4, 0, 2, "");
		comb2D(3, 0, 0, 2, "");
	}

//comb_wrt_PT teacher!!
	public static void comb(int n, int r, int prev, String team) {
		if (r == 0) {
			System.out.println(team);
			return;
		}
		for (int i = prev + 1; i < n; i++) {
//			ith banda udaya hein
//			i= 2
			comb(n, r - 1, i, team + "b" + i);
		}
	}

	public static void combU(int n, int curr, int r, String path) {
		if (curr == n) {
			return;
		}
		if (r == 0) {
			System.out.println(path);
			return;
		}
		
		combU(n, curr + 1, r - 1, path + "b" + curr);// Inc
		combU(n, curr + 1, r, path);// Exc

	}

	public static void comb2D(int n, int r, int c, int QTP, String path) {
		if(QTP==0) {// +ve BC
			System.out.println(path);
			return;
		}
		if(r==n) {//-ve BC
			return;
		}
		if (c == n) {
			r++;
			c = 0;
		}
		comb2D(n, r, c + 1, QTP - 1, 
				path + "Q{" + r + "," + c + "}");
		comb2D(n, r, c + 1, QTP, path);

	}
	
	
}
