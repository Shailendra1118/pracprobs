package com.java8.pracs;

@FunctionalInterface
public interface MyInterface {
	
	int compute(String src, String src2);
	
	static void show(){
		System.out.println("Hello");
	}

}
