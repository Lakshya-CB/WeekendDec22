package Lec_06;

public class Rotate_ {
	public static void main(String[] args) {
		int num = 12345;
		int rot = 3;
		int nod = 0;
		int baackup = num;
		while (num > 0) {
			num = num / 10;
			nod++;
		}
		num = baackup;
		System.out.println(nod);
		rot = rot % nod;
		for (int cnt = 1; cnt <= rot; cnt++) {

			int p1 = num / 10;
			int p2 = num % 10;
			int mult = (int) Math.pow(10, nod - 1);

//			System.out.println(p1 + " - " + p2);
			num = p2 * mult + p1;
			System.out.println(num);

		}
	}

}
