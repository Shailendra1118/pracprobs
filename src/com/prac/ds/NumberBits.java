package com.prac.ds;

import java.util.Arrays;


public class NumberBits {

	public static void main(String[] args) {
		
		System.out.println("2 & 1 "+(2 & 1));
		int num = 4;
		byte arr[] = new byte[8];
		int i = 0;
		while(num > 0){
			arr[i++] = (byte) (num & 1);
			System.out.print(((byte)num & 1)+" ");
			num = num/2;
		}
		System.out.println();
		//System.out.println(Arrays.toString(arr));
		for (int j = arr.length-1; j >=0; j--) {
			System.out.print(arr[j]+" ");
		}
	}

}
