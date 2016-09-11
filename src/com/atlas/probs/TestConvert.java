package com.atlas.probs;

public class TestConvert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte a = 127;
		byte b = 127;
		//a = (byte) (a+b); cannot convert byte to int
		a +=b;
		System.out.println(a);
		//System.out.println(a+b);
		System.out.println(3*0.1 == 0.3);
	}

}
