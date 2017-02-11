package com.java8.pracs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortLambda {

	public static void main(String[] args) {
		String str1 = "shailendra";
		String str2 = "singh";
		List<String> list = new ArrayList<>();
		list.add(str1);
		list.add(str2);
		Comparator<String> comp = (a, b) -> Integer.compare(a.length(), b.length());
		Collections.sort(list, comp);
		System.out.println(list.toString());
		
		Collections.sort(list, (a, b)-> Integer.compare(b.length(), a.length()));
		System.out.println(list);
		
		MyInterface iface = (a, b) -> { if(a.length() > b.length()){
											System.out.println("if called");
											return 0;}
										else
											System.out.println("else called");
											return 1;};
		sort(list, iface);

	}
	
	public static void sort(List<String> list, MyInterface iface) {
        //Arrays.sort((String[]) list.toArray(), 0, list.size(), iface); 
		String[] src = new String[2];
		src[0] = list.get(0);
		src[1] = "asdflkjslkfdjsaldkjflsadkjf";
		System.out.println("src[0] "+src[0]);
		System.out.println("src[1] "+src[1]);
        if (iface.compute(src[0], src[1]) <= 0) {
        	System.out.println("iface compute gets called.");
            return;
         }
	}
	

}
