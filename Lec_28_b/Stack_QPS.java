package Lec_28_b;

import java.util.Arrays;
import java.util.Stack;

public class Stack_QPS {
	public static void main(String[] args) {
		Stack<Integer> S = new Stack<>();
		S.add(10);
		S.add(20);
		S.add(30);
		S.add(40);
		S.add(50);
		System.out.println(S);
//		RevPrint(S);
		ACtualRev(S);
		System.out.println(S);
		int[] arr = { 50, 30, 20, 40, 10, 45, 5, 60, 15, 8 };
		nextGr8er2(arr);

	}

	public static void RevPrint(Stack<Integer> S) {
		if (S.isEmpty()) {
			return;
		}
		int ali = S.pop();
		RevPrint(S);
		S.add(ali);
		System.out.println(ali);
	}

	public static void ACtualRev(Stack<Integer> S) {
		Stack<Integer> EX = new Stack<>();
		while (!S.isEmpty()) {
			EX.add(S.pop());
		}
		copy(EX, S);

	}

	private static void copy(Stack<Integer> S, Stack<Integer> Copy) {
		if (S.isEmpty()) {
			return;
		}
		int ali = S.pop();
		copy(S, Copy);
//		S.add(ali);
//		System.out.println(ali);
		Copy.add(ali);
	}

	public static void nextGr8er(int[] arr) {
		Stack<Integer> S = new Stack<>();
		for (int B : arr) {
			while (!S.isEmpty() && S.peek() < B) {
				int A = S.pop();
				System.out.println(A + "=>" + B);
			}
			S.add(B);
		}
		while (!S.isEmpty()) {
			int A = S.pop();
			System.out.println(A + "=>" + -1);
		}
	}

	public static void nextGr8er2(int[] arr) {
		int[] ans = new int[arr.length];
		Stack<Integer> S = new Stack<>();
//		for (int B : arr) {
		for (int idx = 0; idx < arr.length; idx++) {
			int B = arr[idx];
			while (!S.isEmpty() && arr[S.peek()] < B) {
				int A_idx = S.pop();
//				System.out.println(arr[A_idx] + "=>" + B);
				ans[A_idx] = B;
				
			}
			S.add(idx);
		}
		while (!S.isEmpty()) {
			int A_idx = S.pop();
//			System.out.println(arr[A_idx] + "=>" + -1);
			ans[A_idx] = -1;
		}
		System.out.println(Arrays.toString(ans));
	}
}
