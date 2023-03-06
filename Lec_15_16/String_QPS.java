package Lec_15_16;

import java.util.Scanner;

public class String_QPS {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		String str = scn.nextLine();
		
//		System.out.println(str);
		while(true) {
			int idx = str.lastIndexOf(" ");
			String word = str.substring(idx+1);
			System.out.println(word);
			if(idx==-1) {
				break;
			}
			str = str.substring(0,idx);
		}
	}
}
