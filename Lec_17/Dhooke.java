package Lec_17;

public class Dhooke {
	public static void main(String[] args) {
		int n = 100_000;
		long start = System.currentTimeMillis();

		StringBuilder sb = new StringBuilder("");
//		int sum = 0;
//		String str = "";
		for (int i = 0; i < n; i++) {
//			str = str + i;
//			sum = sum + i;
			sb.append(i);
		}
		
		String ans = sb.toString();
		long end = System.currentTimeMillis();

		System.out.println((end - start) / 1000.0);
	}

}
