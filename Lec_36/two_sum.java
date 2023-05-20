package Lec_36;

import java.util.HashMap;

public class two_sum {
	public int[] twoSum(int[] nums, int target) {
		HashMap<Integer, Integer> HM = new HashMap<>();
		int[] ans = new int[2];
		int idx = 0;
		for (int ali : nums) {
			if (HM.containsKey(target - ali)) {
				ans[0] = idx;
				ans[1] = HM.get(target - ali);
				return ans;

			}
			HM.put(ali, idx);
			idx++;
		}
		return null;
	}
}
