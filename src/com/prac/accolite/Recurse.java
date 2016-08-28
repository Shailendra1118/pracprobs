package com.prac.accolite;

public class Recurse {

	public static void main(String[] args) {
		Recurse rec = new Recurse();
		System.out.println(rec.func(15));
	}

	private int func(int i) {
		int result;
		if(i == 1)
			return 1;
		result = func(i-1);
		return result;
	}

}
