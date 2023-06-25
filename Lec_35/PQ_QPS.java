package Lec_35;

import java.util.Collections;
import java.util.PriorityQueue;

public class PQ_QPS {
	public static void main(String[] args) {
//		int[] arr = { 20, 30, 60, 50, 10, 55, 57, 40 };
//		PQ_QPS obj1 = new PQ_QPS();
//		obj1.topKelements(arr, 3);
//		int[][] arr = { { 10, 20, 30 }, { 15, 35 }, { 5, 7, 12, 25 }, { 17, 22, 40 } };
//		mergeK(arr);
		int[] arr = {1,2,3,4,1,2,3,3,2,9};
		medianStream(arr);
	}

	public void topKelements(int[] arr, int k) {
		PriorityQueue<Integer> PQ = new PriorityQueue<>();
		for (int ali : arr) {
			PQ.add(ali);
			if (PQ.size() > k) {
				PQ.poll();
			}
		}
		System.out.println(PQ);
	}

//	quick search!! => nlogn
	static class pair implements Comparable<pair> {
		public pair(int i, int j, int r) {
			// TODO Auto-generated constructor stub
			ali = i;
			ali_i = j;
			arr_i = r;
		}

		int ali;
		int arr_i;
		int ali_i;

		@Override
		public int compareTo(pair o) {
//			A.compareTo(B)
//			A=this , o=B

			return this.ali - o.ali;
//			return o.ali - this.ali;	
		}
	}

	public static void mergeK(int[][] arr) {
		PriorityQueue<pair> PQ = new PriorityQueue<>();
		for (int r = 0; r < arr.length; r++) {
			PQ.add(new pair(arr[r][0], 0, r));
		}
		while (!PQ.isEmpty()) {
			pair p = PQ.poll();
			System.out.println(p.ali);
//			change ali and chnage ali_idx;
			p.ali_i++;
			if (p.ali_i < arr[p.arr_i].length) {
				p.ali = arr[p.arr_i][p.ali_i];
				PQ.add(p);
			}
		}
	}

	public static void medianStream(int[] arr) {
		PriorityQueue<Integer> Left = new PriorityQueue<>(Collections.reverseOrder());
		PriorityQueue<Integer> Right = new PriorityQueue<>();
		for (int ali : arr) {
			if(Left.isEmpty() || ali<Left.peek()) {
				Left.add(ali);
			}else {
				Right.add(ali);
			}
//			self balancing!!
			if(Left.size()-Right.size()==2) {
				Right.add(Left.poll());
			}
			if(Right.size()-Left.size()==2) {
				Left.add(Right.poll());
			}
//			median
			System.out.println(Left+" -- "+Right);
			if(Left.size()==Right.size()) {
				System.out.println((0.0+Left.peek()+Right.peek())/2);
			}else if(Left.size()>Right.size()) {
				System.out.println(Left.peek());
			}else {
				System.out.println(Right.peek());
			}
		}

	}
}
