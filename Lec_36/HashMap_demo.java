package Lec_36;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class HashMap_demo {
	public static void main(String[] args) {
		HashMap<String , Integer> HM 
		= new HashMap<String , Integer>();
//		HashMap<Key , Bhalue>
		HM.put("Az",10);
		HM.put("xB",20);
		HM.put("Cc",10);
		HM.put("aD",null);
		System.out.println(HM);
		
		System.out.println(HM.get("aD"));
		System.out.println(HM.get("Az"));
		System.out.println(HM.get("zAz"));
		
		System.out.println(HM.containsKey("aD"));
		System.out.println(HM.containsKey("zAz"));
		HM.put("Az",99);
		System.out.println(HM);
		
		System.out.println(HM.size());
		
		System.out.println(HM.keySet());
		
		
		for(String key : HM.keySet()) {
			System.out.println(HM.get(key));
		}
		System.out.println("===========");
		Set <String> Keys = HM.keySet();
		System.out.println(Keys);
		ArrayList<String> AL = 
				new ArrayList<>(Keys);
		System.out.println(AL);
		System.out.println("===========");
		
		HM.remove("Cc");
		System.out.println(HM);
		
		
	}
}
