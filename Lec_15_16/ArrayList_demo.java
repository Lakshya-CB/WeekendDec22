package Lec_15_16;

import java.util.ArrayList;

public class ArrayList_demo {
	public static void main(String[] args) {
		int[] arr = new int[5];
		ArrayList<Integer>AL = new ArrayList<Integer>();
//		size
		System.out.println(arr.length);
		System.out.println(AL.size());
		System.out.println(AL);
		
		AL.add(10);
		System.out.println(AL);
		
		AL.add(20);
		System.out.println(AL);
		
		AL.add(30);
		System.out.println(AL);
		
		AL.add(40);
		System.out.println(AL);
		
//		get!!
		int ali  =AL.get(0);
		System.out.println(AL.get(0));
		System.out.println(ali);
//		set i\
		AL.set(AL.size()-1, 99);
		System.out.println(AL);
//		Integer I = null;
//		System.out.println(I);
//		AL.add(null);
//		System.out.println(AL);
//		AL.remove(1);
//		System.out.println(AL);
		
		AL.add(2,17);
		System.out.println(AL);
	}
}
