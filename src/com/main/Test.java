package com.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test {

	public static void main(String[] args) {
		/*List<Integer> storeIdsDB = new ArrayList<Integer>(Arrays.asList(3451,2154,8545,3232,3154,7852,8423,7982,7930,9730));
		List<Integer> includeStores = new ArrayList<Integer>(Arrays.asList(4654,6963,6863,3451));
		List<Integer> excludeStores = new ArrayList<Integer>(Arrays.asList(3451,2154,9334));
		System.out.println(storeIdsDB);
		
		for (Integer store : includeStores) {
			if(storeIdsDB.contains(store)) {
				System.out.println("StorId : "+store+" is already available" );
				storeIdsDB.remove(store);
			}
		}
		storeIdsDB.addAll(includeStores);
		
		System.out.println("After addition of stores : "+storeIdsDB);
		
		for (Integer store : excludeStores) {
			if(storeIdsDB.contains(store)) {
				storeIdsDB.remove(store);
			}else {
				System.out.println("StorId : "+store+" is not present" );
			}
		}
		
		System.out.println(storeIdsDB);
		*/
		
		
		Map<String,Integer> map = new HashMap<>();
		
		map.put("satya", 434);
		map.put("kkala", 435);
		map.put("pkuma", 798);
		
		System.out.println(map);
		
		
		
		
		
	}

}

