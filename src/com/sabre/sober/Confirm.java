package com.sabre.sober;

public class Confirm extends TestA implements ICapable {
	
	public static void main(String args[]){
		System.out.println("in Main method");
		TestA obj = new TestA();
		obj.method("from main method call");
		getParent(args);
		Integer [] arr = new Integer[20];
		getParent(arr);
		getParent(new Object());
		
		System.out.println("instanceOf: "+ (obj instanceof Confirm));
	}
	
	private static void getParent(Object args) {
		System.out.println("class name: "+args.getClass());
		System.out.println("Parent class name: "+args.getClass().getSuperclass());
	}

	@Override
	public void method(String str) {
		super.method("where it is ?");
		System.out.println(str);
	}
}

class TestA{
	public void method(String str){
		System.out.println(str);
	}
}

interface ICapable{
	public void method(String str);
}
