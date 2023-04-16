package Lec_28;

import java.util.ArrayList;

public class Client {
	public static void main(String[] args) {
		Stack S = new Dynamic_Stack();
		S.add(10);
		S.add(20);
		S.add(30);
		S.add(40);
		S.add(50);
		S.add(60);
		S.add(70);
		S.add(80);
		System.out.println();
		while (!S.isEmpty()) {
			System.out.println(S.pop());
		}
		Object obj1 = new Dynamic_Stack();
		Object obj2 = new Stack();
		System.out.println(obj1);
		ArrayList<Integer>AL=null;
		System.out.println(AL);
//			obj2.
	}
}
