package com.prac.arrays;

import java.util.ArrayList;
import java.util.StringTokenizer;

public class StringReverse {

	public static void main(String[] args) {
		String str = "Sky is blues so beautiful";
		StringTokenizer tkz = new StringTokenizer(str);
		ArrayList<String> list = new ArrayList<String>();
		while(tkz.hasMoreTokens()){
			String cur = tkz.nextToken();
			list.add(cur);
		}
		System.out.println(list.toString());
		
		int i = 0;
		int j = list.size()-1;
		System.out.println("size "+list.size());
		while(i<j){
			String temp = list.remove(j);
			list.add(j, list.get(i));
			list.add(i, temp);
			i++;
			j--;
			
			System.out.println(list);
		}
		
		

	}

}
