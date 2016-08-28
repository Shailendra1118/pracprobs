package com.prac.accolite;

public class NumConversion {

	public static void main(String[] args) {
		int i = 0x1F;
		System.out.println("Hex "+i);
		int j = 037;
		System.out.println("Octal "+j);
		
		int num = 31;		
		System.out.println(Integer.toHexString(num));
		int mag = Integer.SIZE - Integer.numberOfLeadingZeros(num);
		int chars = Math.max(((mag + (4 - 1)) / 4), 1);  //shift = 4 for hex
        char[] buf = new char[chars];
		System.out.println(buf.length);
		
		
	}

}
