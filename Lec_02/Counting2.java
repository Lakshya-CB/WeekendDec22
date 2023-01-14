package Lec_02;

public class Counting2 {
	public static void main(String[] args) {
		int count = 1;
		int n = 5;
		int sum =0;
		while(count<=n) {
			System.out.println(count);
			count = count+1;
			sum = sum + count;			
		}
	}
}
