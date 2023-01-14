package Lec_03;

public class PRime_factor {
	public static void main(String[] args) {
		int num = 12;
		int divisor = 2;
		while (num > 1) {
			if (num % divisor == 0) {
				System.out.println(divisor);
				num = num / divisor;
			} else {
				divisor++;
			}
		}

//		##########
		
	}
}
