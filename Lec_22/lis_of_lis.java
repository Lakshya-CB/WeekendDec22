package Lec_22;

import java.util.ArrayList;

public class lis_of_lis {
	public static void main(String[] args) {
		ArrayList<ArrayList<Integer>> biggy = new ArrayList<>();

		ArrayList<Integer> AL = new ArrayList<>();
		AL.add(10);
		biggy.add(new ArrayList<>(AL));
		AL.add(20);
		biggy.add(new ArrayList<>(AL));
		AL.add(30);
		biggy.add(new ArrayList<>(AL));
		AL.add(40);
		biggy.add(new ArrayList<>(AL));
		AL.add(50);
		biggy.add(new ArrayList<>(AL));


		System.out.println(biggy);
	}
	
}
