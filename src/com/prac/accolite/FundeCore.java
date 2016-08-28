package com.prac.accolite;

public class FundeCore {

	public static void main(String[] args) {
		FundeCore fc = new FundeCore();
		Animal o1 = new Animal();
		Horse o2 = new Horse();
		Animal o3 = new Horse();
		fc.doStuff(o3);
		
		o2.display();
		o3.display();
		
		Integer a = new Integer(10);
		Integer b = new Integer(10);
		if(a == b)
			System.out.println("a > b");  // < > will trigger un-boxing
		else
			System.out.println("not equal");
		
		Integer c = 10;
		Integer d = 10;
		if(c == d)
			System.out.println("c==d");
		
		String str = new String("a");
		String stra = new String("b");
		if(str != stra)
			System.out.println("string equal");
	}
	
	public void doStuff(Animal obj){
		System.out.println("In Animal method");
		System.out.println(obj.getClass());
	}
	public void doStuff(Horse obj){
		System.out.println("In Horse method");
		System.out.println(obj.getClass());
	}

}

class Animal {
	public void display(){
		System.out.println("in Animal display");
	}
}
class Horse extends Animal {
	public void display(){
		System.out.println("in Horse display");
	}
}

abstract class Parent{
	abstract public void doSome();
	abstract void doNothing();
	void showProgress(){
		System.out.println("progress");
	}
}

class Child extends Parent{

	@Override
	public void doSome() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void doNothing() {
		// TODO Auto-generated method stub
		
	}
	
}
