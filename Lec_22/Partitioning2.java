package Lec_22;

import java.util.ArrayList;

public class Partitioning2 {
	public static void main(String[] args) {
		ArrayList<ArrayList<String>> Biggy = new ArrayList<>(); 
		ArrayList<String> bag = new ArrayList<>();
		suvle("ababa", "", bag,Biggy);
//		System.out.println(bag);
		System.out.println(Biggy);
	}

	public static void suvle(String table, String bag, ArrayList<String> AL,ArrayList<ArrayList<String>> Biggy) {
		if (table.isEmpty()) {
			Biggy.add(new ArrayList<>(AL));
			System.out.println("=============");
			System.out.println(bag);
			System.out.println(AL);
			System.out.println("=============");
		}
		for (int chakku = 1; chakku <= table.length(); chakku++) {
			String piece = table.substring(0, chakku);
			if (isPalin(piece)) {
				String remain = table.substring(chakku);
				AL.add(piece);
				suvle(remain, bag + " - " + piece, AL,Biggy);
				AL.remove(AL.size() - 1);
			}
		}
	}

	private static boolean isPalin(String piece) {
		int s = 0;
		int e = piece.length() - 1;
		while (s < e) {
			if (piece.charAt(s) != piece.charAt(e)) {
				return false;
			}
			s++;
			e--;
		}
		return true;
	}
}
