package com.java8.pracs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Utils {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Hello");
		list.add("CamelChars");
		
		Stream<String> stream = list.stream().map(String::toLowerCase);
		Iterator<String> iter = stream.iterator();
		while(iter.hasNext())
			System.out.println(iter.next());
		System.out.println(list);
		
		Map<String,String> map = new HashMap<>();
		map.put("hello", "Mr");
		map.put("Bye", "Shailendra");
		map.put("howru", "Mr");
		map.put("cya", "Akhil");
		
		List<String> res = map.entrySet().stream().filter(m->"Mr".equals(m.getValue()))
				.map(m->m.getValue()).collect(Collectors.toList());
		System.out.println(res);
	}

}
