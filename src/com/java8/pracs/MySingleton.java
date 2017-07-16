package com.java8.pracs;

import java.io.Serializable;

public class MySingleton implements Cloneable, Serializable{
	
	private static final long serialVersionUID = 1L;
	private String myState = "MP";
	private static final MySingleton INSTANCE = new MySingleton();
	
	private MySingleton(){
		//System.out.println(INSTANCE.toString()); //java.lang.ExceptionInInitializerError Exception during call to constructor
		System.out.println("Private constructor got invoked.");
		//if(INSTANCE != null)
		//	throw new RuntimeException("Illegal call to constructor");
	}
	
	public static MySingleton getInstance() throws Exception{		
		System.out.println(INSTANCE.toString());
		return INSTANCE;
	}
	
	public String getState(){
		return myState;
	}
	
	public Object clone() throws CloneNotSupportedException{
		//return new MySingleton();
		return super.clone();
	}

}
