package Lec_30;

import java.util.LinkedList;
import java.util.Queue;

public class Que_QPS {
	public static void main(String[] args) {
		Queue<Integer> Q = new LinkedList<>();
		Q.add(10);
		Q.add(20);
		Q.add(30);
		Q.add(40);
		System.out.println(Q);
//		System.out.println(Q.poll());
//		System.out.println(Q.poll());
//		System.out.println(Q.poll());
//		System.out.println(Q);

//		printRev(Q, 0);
//		System.out.println(Q);
		int[] arr = {-20,10,-5,4,6,-9,-80,60,50};
		FirstNEg(arr, 3);
	}

	public static void printRev(Queue<Integer> Q, int cnt) {
		if (cnt == Q.size()) {
			return;
		}
		int ali = Q.poll();
		Q.add(ali);
		printRev(Q, cnt + 1);
		System.out.println(ali);
	}

//	reverse Q is HW!!
	public static void FirstNEg(int[] arr, int k) {
		Queue<Integer> Q = new LinkedList<>();
		for (int i = 0; i < k; i++) {
			if (arr[i] < 0) {
				Q.add(i);
			}
		}
//		System.out.println(arr[Q.peek()]);
		for (int s = 0; s <= arr.length - k; s++) {
			int e = s + k - 1;
			if (arr[e] < 0) {
				Q.add(e);
			}
			while (!Q.isEmpty() && Q.peek() < s) {
				Q.poll();
			}
			System.out.println(arr[Q.peek()]);
		}
	}

}
