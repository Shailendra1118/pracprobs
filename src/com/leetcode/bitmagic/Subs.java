package com.leetcode.bitmagic;

public class Subs {

	public static void main(String[] args) {
		int i = 1;
		int j = 10;
		System.out.println("i "+Integer.toBinaryString(i));
		System.out.println("j "+Integer.toBinaryString(j));
		System.out.println(Integer.toBinaryString(8-1));
		
		String s1 = "bba";
		String s2 = "aabaaaababaabbbabbabbbaabababaaaaaababaaabbabbabbabbaaaabbbbbbaabbabbbbbabababbaaabbaabbbababbb";
		int res = subStr(s1, s2);
		System.out.println("Res: "+res);
	}

	//edge cases IMP
	private static int subStr(String s1, String s2) {
		int len1 = s1.length();
		int len2 = s2.length();
		if(len1 == 0 || len2 == 0)
			return -1;
		
		int i = 0, j = 0, res = -1;
		while(j < len2 && i < len1){
			
			if(s1.charAt(i) == s2.charAt(j)){
				if(res == -1)
					res = j;
				i++;
				j++;
			}else{ // chars not equal
				if(res != -1){ //matching was going on
					i = 0;
					j = res+1;
					res = -1;
				}
				else
					j++;
				
			}
		}
		System.out.println("I "+i);
		if(i-1 < len1-1) // needle string was search compeletly
			return -1;
		else
			return res;
	}

}
