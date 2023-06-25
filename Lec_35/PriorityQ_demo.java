package Lec_35;

import java.util.Collections;
import java.util.PriorityQueue;


public class PriorityQ_demo {
	public static void main(String[] args) {
		PriorityQueue<Integer> PQ = 
				new PriorityQueue<>(Collections.reverseOrder());
		
		//Min Heap // Rank ke hisaab se priority!!
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
