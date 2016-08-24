package com.atlas.probs;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class Solutions {

	public static void main(String[] args) {

		String str = "11";
		for (int i = 0; i < str.length(); i++) {
			String cur = str.substring(i, i+1);
			System.out.println(cur);
		}
		HashMap<String, String> map = new HashMap<>();
		Iterator<Entry<String,String>> iter = map.entrySet().iterator();
		while(iter.hasNext()){
			Entry<String,String> entry = iter.next();
			System.out.println(entry.getValue()+" "+entry.getKey());
		}
		
	}

}
