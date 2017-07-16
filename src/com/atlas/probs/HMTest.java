package com.atlas.probs;

import java.util.HashMap;

public class HMTest {

	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<>();
		map.put("Hello", 1);
		map.put("Hello1", 2);
		map.put("Hello2", 3);
		
		System.out.println(map.get("Hello2"));

	}

}
