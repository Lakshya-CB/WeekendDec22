package Lec_05;

public class F_to_C {
	public static void main(String[] args) {
		int min_F = 0;
		int max_F = 100;
		int step = 20;
		int F = min_F;
		while (F <= max_F) {
//			int C = (5 * (F - 32))/9;

			int C = (int) ((5.0 / 9) * (F - 32));
			System.out.println(F + " : " + C);
			F = F + step;
		}
	}
}
