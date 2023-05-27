package Lec_DP;

import java.util.HashMap;

public class min_steps {
	public static void main(String[] args) {
		System.out.println(solve(100091231, new HashMap<>()));
	}

	public static int solve(int n,HashMap<Integer,Integer> DP) {
		if(n==1) {
			return 0;
		}
		if(DP.containsKey(n)) {
			return DP.get(n);
		}
		if (n % 2 == 0) {
			int sp = solve(n/2,DP)+1;
			DP.put(n, sp);
			return sp;
		}else {
			int sp1 = solve(n-1,DP);
			int sp2 = solve((n+1)/2,DP)+1;
			DP.put(n, Math.min(sp1, sp2)+1);
			return Math.min(sp1, sp2)+1;
		}
	}
}
