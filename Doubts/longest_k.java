package Doubts;

public class longest_k {
	public static void main(String[] args) {
		String str = "aabbcabcdcbadfcba";
		int k = 3;

		int s = 0;
		int e = 0;
		int[] btua = new int[26];
		int score = 0;
		while (true) {
			System.out.println(str.substring(s,e));
			if (score <= k) {
				char ch = str.charAt(e);
				if (btua[ch - 'a'] == 0) {
					score++;
				}
				btua[ch - 'a']++;
				e++;
			} else {
//		del s cahr!!
				char ch = str.charAt(s);
				btua[ch - 'a']--;
				if(btua[ch - 'a']==0) {
					score--;
				}
				s++;
			}
		}
	}
}
