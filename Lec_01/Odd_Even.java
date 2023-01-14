package Lec_01;

public class Odd_Even {
	public static void main(String[] args){
		int num = 13;
		int rem = num % 2;
		System.out.println(rem);
		if (rem == 0) {
			System.out.println("Even");
		}
		else {
			System.out.println("ODD");
		}
		System.out.println(rem == 0);
	}
}
