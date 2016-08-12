package com.prac.threads;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Fundaes {

	{
		System.out.println("block in class");
		System.out.println();
	}
	
	static{
		System.out.println("static block in class");
	}
	
	public Fundaes(){
		System.out.println("In constructor");
	}
	public static void main(String[] args) {
		final String str = "Shailendra";
		//str = "";
		//System.out.println((Object)str);
		final StringBuffer buffer = new StringBuffer("Sam");
		buffer.append("Singh");
		buffer.append("Yadav");
		//System.out.println(buffer);
		
		Fundaes fun = new Fundaes();
		System.out.println("From new-"+fun);
		
		try {
			fun = (Fundaes) Class.forName("com.prac.threads.Fundaes").newInstance();
			System.out.println("From Class for name-"+fun);
		} catch (InstantiationException | IllegalAccessException
				| ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		try {
			Constructor<?> ctr[] = Fundaes.class.getConstructors();
			fun = (Fundaes) ctr[0].newInstance(null);
			System.out.println("From reflection-"+fun);
		} catch (InstantiationException | IllegalAccessException
				| IllegalArgumentException | InvocationTargetException
				| SecurityException e) {
			e.printStackTrace();
		}
		
		
	}

}
