package Lec_14;

public class String_QPS_2 {
	public static void main(String[] args) {
//		System.out.println(isPalindrome("ioi"));
		palinSS2("nonittin");
	}

	public static void palinSS(String str) {
		for (int s = 0; s < str.length(); s++) {
			for (int e = s + 1; e <= str.length(); e++) {
				String ss = str.substring(s, e);
				if (isPalindrome(ss)) {
					System.out.println(ss);
				}
			}
		}
	}

	public static void palinSS2(String str) {
		for (int c = 0; c < str.length(); c++) {
			solve(str, c, c);
			solve(str, c, c+1);
			
		}
	}

	public static void solve(String str, int L, int R) {
		while (L >= 0 && R < str.length() && str.charAt(L) == str.charAt(R)) {
			System.out.println(str.substring(L, R + 1));
			L--;
			R++;
		}
	}

	public static boolean isPalindrome(String str) {
		int L = 0;
		int R = str.length() - 1;
		while (L < R) {
			if (str.charAt(L) != str.charAt(R)) {
				return false;
			} else {
				L++;
				R--;
			}
		}
		return true;
	}

}
