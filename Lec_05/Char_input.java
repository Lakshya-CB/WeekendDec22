package Lec_05;

import java.util.Scanner;

public class Char_input {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.nextLine();
		System.out.println(str);
		char ch = str.charAt(0);
		System.out.println(ch);
	}
}
