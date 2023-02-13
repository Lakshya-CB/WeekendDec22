package Lec_09_Ex;

import java.util.Scanner;

public class Shopping_game {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		int t = scn.nextInt();
		while (t > 0) {
			t--;
			
			int A_cap = scn.nextInt();
			int H_cap = scn.nextInt();
			
			int A = 0;
			int H = 0;
			int phone = 1;
			while (true) {
				A = A + phone;
				phone++;
				if(A>A_cap) {
					System.out.println("Harshit");
					break;
				}
				H = H + phone;
				phone++;
				if(H>H_cap) {
					System.out.println("Aayush");
					break;
				}
			}
		}
	}
}
