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
