package Lec_35;

import java.util.Collections;
import java.util.PriorityQueue;

public class apna_demo {
	public static void main(String[] args) {
		Heap PQ = new Heap();

		// Min Heap // Rank ke hisaab se priority!!
		PQ.add(99);
		PQ.add(100);
		PQ.add(2);
		PQ.add(4);
		PQ.add(5);

		System.out.println(PQ);
		System.out.println(PQ.poll());
		System.out.println(PQ);
		System.out.println(PQ.poll());
		System.out.println(PQ);
		System.out.println(PQ.poll());
		System.out.println(PQ);
		System.out.println(PQ.poll());
		System.out.println(PQ);
	}
}
