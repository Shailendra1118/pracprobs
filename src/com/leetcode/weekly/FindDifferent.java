package com.leetcode.weekly;

import java.util.Arrays;

public class FindDifferent {

	public static void main(String[] args) {
		String s = "bacd";
		String t = "acadb";
		char c = findTheDifference(s,t);
		System.out.println("missing: "+c);
		System.out.println("from XOR: "+findEfficiently(s, t));
	}
	
	public static char findTheDifference(String s, String t) {
        char sa[] = s.toCharArray();
        char ta[] = t.toCharArray();
        Arrays.sort(sa);
        Arrays.sort(ta);
        int n = 0;
        while(n < ta.length){
        	if(n < sa.length && sa[n] == ta[n]){
        		n++;
        	}else{
        		return ta[n];
        	}
        }
        return ta[n];
        
       
        
    }
	
	public static char findEfficiently(String s, String t){
		int result = 0;
		for (char c : s.toCharArray()) {
			result = result ^ c;
		}
		
		for (char c : t.toCharArray()) {
			result = result ^ c;
		}
		
		return (char) result;
	}

}
