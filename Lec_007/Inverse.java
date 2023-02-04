package Lec_13;

public class Inverse {
	public static void main(String[] args) {
		int num = 23145;
		int pos = 1;
		int sum = 0;
		while (num > 0) {
			int digit = num % 10;
			System.out.println(digit + " - " + 
			pos + " - " + pos * Math.pow(10, digit - 1));

			sum = (int) (sum + pos * Math.pow(10, digit - 1));

			num = num / 10;
			pos++;
		}
		System.out.println(sum);
	}
}
