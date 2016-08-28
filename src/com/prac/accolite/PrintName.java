package com.prac.accolite;

public class PrintName {

	public static void main(String[] args) {
		String str = "Shailendra";
		printMyName(str);
	}

	private static void printMyName(String str) {
		if(str.length() == 0)
			return;
		System.out.println(str.charAt(0));
		str = str.substring(1, str.length());
		printMyName(str);
	}

}
