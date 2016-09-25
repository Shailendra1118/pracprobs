package com.prac.ds;

public class BinaryUtil {

	public static void main(String[] args) {
		int i = 110111;
		System.out.println(isBinary(i));
		System.out.println(isBinaryOne(i));

	}

	private static boolean isBinaryOne(int i) {
		boolean flag = false;
		System.out.println("i^i "+(i ^ i));
		if((i ^ i) == i){
			flag = true;
		}	
		return flag;
	}

	private static boolean isBinary(int i) {
		if(i%10 != 0 && i%10 != 1)
			return false;
		else{
			i = i/10;
			if(i !=0)
				return isBinary(i);
			return true;
		}
		
	}

}
