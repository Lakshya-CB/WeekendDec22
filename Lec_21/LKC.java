package Lec_21;

public class LKC {
	static String[] options_all = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
	
	public static void main(String[] args) {
		suvle("243", "");
	}
	
	public static void suvle(String digits, String ans) {
//	digits = "243"
//	ans= ""
		if(digits.isEmpty()) {
			System.out.println(ans);
			return;
		}
		char button = digits.charAt(0);
		String options = options_all[button-'0'];// abc
		String remain = digits.substring(1);
		for(int idx = 0;idx<options.length();idx++) {
			suvle(remain, ans+options.charAt(idx));
		}
	}

}
