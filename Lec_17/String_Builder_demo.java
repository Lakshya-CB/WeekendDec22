package Lec_17;

public class String_Builder_demo {
	public static void main(String[] args) {
		String str = new String("hello");
		System.out.println(str);

		StringBuilder sb = new StringBuilder(str);
		System.out.println(sb);

//		##########
		System.out.println(str.charAt(0));
		System.out.println(sb.charAt(0));

//		##########
		System.out.println(str.length());
		System.out.println(sb.length());

//		##########
		sb.append("asdpoj");
		System.out.println(sb);

		sb.insert(1, "Z");
		System.out.println(sb);

		sb.setCharAt(1, '@');
		System.out.println(sb);
		
		String str1 = sb.toString();
		System.out.println(str1);

	}
}
