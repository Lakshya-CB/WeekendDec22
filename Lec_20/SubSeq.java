package Lec_20;

public class SubSeq {
	public static void main(String[] args) {
		SS("abc","");
	}

	public static void SS(String str, String team) {
		if (str.isEmpty()) {
			System.out.println(team+"---");
			return;
		}
//		str = "abc"
//		team = ""
		char ch = str.charAt(0);
		String remain = str.substring(1);
		SS(remain, team + ch);
		SS(remain, team);
	}
}
