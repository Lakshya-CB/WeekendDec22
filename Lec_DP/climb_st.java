package Lec_DP;

public class climb_st {
	public int climbStairsTD(int n, int dest, Integer[] dp) {
		if (n > dest) {
			return 0;
		}
		if (n == dest) {
			return 1;
		}
		if (dp[n] != null) {
			return dp[n];
		}
		int sp1 = climbStairsTD(n + 1, dest, dp);
		int sp2 = climbStairsTD(n + 2, dest, dp);
		dp[n] = sp1 + sp2;
		return sp1 + sp2;
	}

	public static int BU(int dest) {
		int[] dp = new int[dest + 2];

		for (int n = dest; n >= 0; n--) {
//			dp[n]
			if (dest == n) {
				dp[n] = 1;
				continue;
			}
			int sp1 = dp[n + 1];
			int sp2 = dp[n + 2];

			dp[n] = sp1 + sp2;

		}
		return dp[0];

	}
}
