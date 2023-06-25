package Doubts;

import java.util.ArrayList;

public class tower_of_hen {
	static ArrayList<Integer> A = new ArrayList<>();

	static ArrayList<Integer> B = new ArrayList<>();
	static ArrayList<Integer> C = new ArrayList<>();

	public static void main(String[] args) {
		A.add(3);
		A.add(2);
		A.add(1);

		place(3, A, C, B);
	}

	private static void place(int n, ArrayList<Integer> src, ArrayList<Integer> dest, ArrayList<Integer> helper) {
		if (n == 0) {
			return;
		}
		place(n - 1, src, helper, dest);
		int disk = src.remove(src.size() - 1);
		dest.add(disk);
		System.out.println(A + "\t" + B + "\t" + C);

		place(n - 1, helper, dest, src);

	}

}
