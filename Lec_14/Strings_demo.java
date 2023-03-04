package Lec_14;

public class Strings_demo {
	public static void main(String[] args) {
		String str = "abcd";
		
		System.out.println(str);
//		
		System.out.println(str.length());
		
		System.out.println(str.charAt(1));
		System.out.println(str.charAt(str.length()-1));
		
//		str[1]='z';

//		System.out.println(str.charAt(str.length()));
		System.out.println("=======");
		
		System.out.println(str.indexOf("daf"));
		
		System.out.println(str.lastIndexOf("daf"));
		
		System.out.println(str.indexOf("FUN"));
		System.out.println("===========");
		for(int s = 0;s<str.length();s++) {
			for(int e = s+1;e<=str.length();e++) {
				System.out.println(str.substring(s, e));
			}
		}
		System.out.println("============");
		dele(str, 2);
		System.out.println("============");
		System.out.println(str.startsWith("Ab"));
		System.out.println(str.endsWith("cd"));
		
		
	}
	public static void dele(String str, int i) {
		String p1 = str.substring(0,i);
		String p2 = str.substring(i+1);
		System.out.println(p1+p2);
	}
}
