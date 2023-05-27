package Lec_DP;

public class coin_change {
	public static void main(String[] args) {
		int[] coins = { 2, 5, 3, 6 };
		int A = 10;
//		System.out.println(solve(A, 0, coins, new Integer[A + 1][coins.length]));
		System.out.println(BU(coins, A));
	}

	public static int solve(int A, int idx, int[] coins, Integer[][] dp) {
		if (A == 0) {
			return 1;
		}
		if (A < 0 || idx == coins.length) {
			return 0;
		}
		if (dp[A][idx] != null) {
			return dp[A][idx];
		}
		int sp1 = solve(A - coins[idx], idx, coins, dp);
		int sp2 = solve(A, idx + 1, coins, dp);
		dp[A][idx] = sp1 + sp2;
		return sp1 + sp2;
	}

	public static int BU(int[] coins, int Amount) {
		int[][] dp = new int[Amount + 2][coins.length + 2];
		for (int A = 0; A <= Amount; A++) {
			for (int idx = coins.length - 1; idx >= 0; idx--) {
//				dp[A][idx]
				if (A == 0) {
					dp[A][idx] = 1;
					continue;
				}
				int sp1 = 0;
				if (A - coins[idx] >= 0) {
					sp1 = dp[A - coins[idx]][idx];
				}
				int sp2 = dp[A][idx + 1];
				dp[A][idx] = sp1 + sp2;
			}
		}

		return dp[Amount][0];
	}

}
