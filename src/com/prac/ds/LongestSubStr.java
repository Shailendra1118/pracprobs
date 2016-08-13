package com.prac.ds;


public class LongestSubStr {

	public static void main(String[] args) {
		String input = "abcabcbbbpqrstwd";
		char arr[] = input.toCharArray();
		boolean flag[] = new boolean[26];
		//System.out.println(Arrays.toString(flag));
		int i=0;
		int j=0;
		int maxLen = 0;
		while(j<input.length()){
			System.out.println("length: "+input.length()+" arr[j]: "+arr[j]);
			char curr = arr[j];
			int idx = curr-'a';
			System.out.println("idx: "+idx);
			if(flag[idx]){
				maxLen = Math.max(maxLen, j-i);
				while(arr[i] != arr[j]){
					flag[arr[i]-'a'] = false;
					i++;
				}
				i++;
				j++;
			}else{
				flag[idx] = true;
				j++;
			}
		}
		
		maxLen = Math.max(maxLen, arr.length-i);
		System.out.println("MaxLengh: "+maxLen);
	}

}
