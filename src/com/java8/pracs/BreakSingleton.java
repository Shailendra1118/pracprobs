package com.java8.pracs;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class BreakSingleton {

	public static void main(String[] args) throws Exception {
		MySingleton single = MySingleton.getInstance();
		System.out.println(single.getState());
		
		breakIntoSingleton(single);
		breakIntoSingletonByReflection();
		breakThroughSerialization();

	}
	
	private static void breakThroughSerialization() {
		
	}

	private static void breakIntoSingleton(MySingleton single){
		Class<MySingleton> clazz = MySingleton.class;
		try {
			Method ms = clazz.getMethod("clone");
			//System.out.println(ms.toGenericString());
			MySingleton obj = (MySingleton) ms.invoke(single);
			System.out.println(obj.toString());
		} catch (NoSuchMethodException | SecurityException | IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
			e.printStackTrace();
		}
	}
	
	private static void breakIntoSingletonByReflection(){
		Class<MySingleton> clazz = MySingleton.class;
		try {
			Constructor<MySingleton> con = clazz.getDeclaredConstructor();
			con.setAccessible(true);
			try {
				MySingleton sin = (MySingleton) con.newInstance();
				System.out.println("newly created sin: "+sin.toString());
			} catch (InstantiationException | IllegalAccessException
					| IllegalArgumentException | InvocationTargetException e) {
				e.printStackTrace();
			}
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e1) {
			e1.printStackTrace();
		}
	}

}
