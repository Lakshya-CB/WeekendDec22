package Lec_DP;

public class Dp_1 {
	public static void main(String[] args) {
		int n = 10000;
		System.out.println(FiboTD(n, new Integer[n + 1]));
	}

	public static int FiboTD(int n, Integer[] dp) {
		if (n <= 1) {
			return n;
		}
		if (dp[n] != null) {
			return dp[n];
		}
		int sp1 = FiboTD(n - 1, dp);
		int sp2 = FiboTD(n - 2, dp);
//		Fibo (n) = > index?!
		dp[n] = sp1 + sp2;
		return sp1 + sp2;
	}

//  Tabulation// Bottoms Up
	public static int BU(int num) {
		
		int[] dp = new int[num+1];
		dp[1] = 1;
		for (int n = 2; n <= num; n++) {
//			dp[n]!!
			int sp1 = dp[n - 1];
			int sp2 = dp[n - 2];
//			Fibo (n) = > index?!
			dp[n] = sp1 + sp2;
			
		}
		return num;
	}
}
