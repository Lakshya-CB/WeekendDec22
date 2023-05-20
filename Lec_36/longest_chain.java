package Lec_36;

import java.util.HashSet;

public class longest_chain {
	public static void main(String[] args) {
		int[] arr = { 2, 12, 9, 16, 10, 5, 3, 20, 25, 11, 1, 8, 6 };
		solve(arr);
	}

	public static void solve(int[] arr) {
		HashSet<Integer> set = new HashSet<>();
		for (int ali : arr) {
			set.add(ali);
		}
		int ans =0;
//		System.out.println(set);
		for (int ali : arr) {
			if (!set.contains(ali - 1)) {
				int len = 0;
//				System.out.println(ali +" start");
				int temp = ali;
				while(set.contains(temp)) {
//					System.out.print(temp+"=>");
					len++;
					temp++;
				}
				ans = Math.max(len, ans);
				System.out.println(len +" ki mili");
			}
		}
		System.out.println("final answer is "+ans);
	}
}
