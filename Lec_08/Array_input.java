package Lec_08;

import java.util.Scanner;

public class Array_input {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		int[] arr = new int[N];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
		}
		
		for (int aaam : arr) {
			System.out.println(aaam);
		}
	}
}
