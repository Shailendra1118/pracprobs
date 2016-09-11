package com.atlas.probs;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class SpeakAndSay {

	static Map<String, String> map = new LinkedHashMap<>();
	public static void main(String[] args) {
		//System.out.println(speak("21"));
		System.out.println(speakAgain("11", 2));
	}

	private static String speakAgain(String str, int n) {
		if(n == 0){
			return str;
		}
		n = n-1;
		str = speak(str);
		return speakAgain(str, n);
		//return str;
	}

	private static String speak(String ip) {
		for (int i = 0; i < ip.length(); i++) {
			String cur = ip.substring(i, i+1);
			System.out.println("cur: "+cur);
			if(map.containsKey(cur)){
				int val = Integer.valueOf(map.get(cur));
				map.put(cur, Integer.toString(++val));
			}else{
				map.put(cur, "1");
			}
		}		
		//String op = "";
		Iterator<Entry<String,String>> iter = map.entrySet().iterator();
		StringBuilder sb = new StringBuilder();
		while(iter.hasNext()){
			Entry<String,String> entry = iter.next();
			System.out.println(entry.getValue()+" "+entry.getKey());
			sb.append(entry.getValue()+entry.getKey());
		}
		map.clear(); //bug
		return sb.toString();
	}

}
