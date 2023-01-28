package Lec_05;

public class Rotate_ {
	public static void main(String[] args) {
		int num = 12345;
		int nod = 0;
		int baackup = num;
		while (num > 0) {
			num = num / 10;
			nod++;
		}
		num = baackup;
		System.out.println(nod);
		int p1 = num / 10;
		int p2 = num % 10;
		int mult = (int) Math.pow(10, nod - 1);

		System.out.println(p1 + " - " + p2);

		System.out.println(p2 * mult + p1);
//		System.out.println(p2 + "" + p1);

	}

}
