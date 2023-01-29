package Lec_06;

public class Rotate_2 {
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

		int divisor = (int) Math.pow(10, rot);
		int p1 = num / divisor; // nod-rot
		int p2 = num % divisor; // rot
		System.out.println(p1 + " - " + p2);
		int mult = (int) Math.pow(10, nod - rot	);
		System.out.println(mult * p2 + p1);
	}
}
