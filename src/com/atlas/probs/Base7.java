package com.atlas.probs;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Base7 {

	static Map<Integer,String> map = new HashMap<>();
	public static void main(String[] args) {		
		map.put(0, "0");
		map.put(1,"a");
		map.put(2,"t");
		map.put(3,"l");
		map.put(4,"s");
		map.put(5,"i");
		map.put(6,"n");	
		
		Scanner scanner = null;
		try {
			scanner = new Scanner(new File("D:\\Keppler\\CrazyCode\\src\\com\\atlas\\probs\\input.txt"));
			int input = scanner.nextInt();
			System.out.println(convert(input));
			//System.out.println(input%7);
		}catch(Exception e){
			e.printStackTrace();
		}
	}

	private static String convert(int input) {
		StringBuilder sb = new StringBuilder();
		if(input <=6)
			return map.get(input);
		while(input/7 != 0){
			int i = input%7;
			sb.append(map.get(i));
			input = input/7;
		}
		sb.append(map.get(input));
		System.out.println(sb.toString());
		return sb.reverse().toString();
	}

}
