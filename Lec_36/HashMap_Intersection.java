package Lec_36;

import java.util.HashMap;

public class HashMap_Intersection {
	public static void main(String[] args) {
		int[] arr1 = { 30, 20, 40, 50, 70, 30, 20, 20, 50, 50 };
		int[] arr2 = { 50, 80, 30, 20, 20, 20, 90, 50, 20 };
		Intersection(arr1, arr2);
	}
	public static void Intersection(int[] arr1, int[] arr2) {
		HashMap<Integer,Integer> HM = new HashMap<>();
		for(int ali : arr2) {
//			HM.put(ali,1);
//			if(HM.containsKey(ali)) {
//				int prev_freq = HM.get(ali);
//				HM.put(ali, prev_freq+1);
//			}else {
//				HM.put(ali,1);	
//			}
			int prev_freq = HM.getOrDefault(ali, 0);
			HM.put(ali,prev_freq+1);	
		}
		for(int ali : arr1) {
			if (HM.containsKey(ali) && HM.get(ali) > 0) {
				System.out.println(ali);
				int prev_freq = HM.get(ali);
				HM.put(ali,prev_freq-1);
				
			}
		}
//		System.out.println(HM);
	}

	
	
}
