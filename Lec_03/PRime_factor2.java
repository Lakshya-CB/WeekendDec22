package Lec_03;

public class PRime_factor2 {
	public static void main(String[] args) {

		int num = 12;
		int divisor = 2;
		while (divisor <= num) {
			if(num%divisor==0) {
				System.out.println(divisor);
			}
			while (num % divisor == 0) {
				num= num/divisor;
			}
			divisor++;
		}
	}
}
