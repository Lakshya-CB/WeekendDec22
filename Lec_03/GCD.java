package Lec_03;

public class GCD {
	public static void main(String[] args) {
		int n1 = 24;
		int n2 = 16;
		int hcf = 1;
		int div = 1;
		while (div <= n1) {
			if (n1 % div == 0 && n2 % div == 0) {
//				System.out.println(div);
				hcf = div;
			}
			div++;
		}
		System.out.println(hcf);
	}
}
