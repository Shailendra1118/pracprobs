package com.sabre.sober;

import java.io.IOException;

public class ThowIt {
	public void Constructor(){
		System.out.println("constrution is method here");
	}

	public void ThrowIt(){
		System.out.println("in ThrowItmethod");
	}
	public static void main(String[] args) {
		ThowIt it = new ThowIt();
		it.ThrowIt();
		it.Constructor();
		try {
			Parent c = new Child();
			c.display();
		} catch (IOException e) {
			System.out.println("In main catch block");
			e.printStackTrace();
		}
		
	}

}


class Parent{
	public Parent() throws IOException{
		System.out.println("in Parent construcgor");
		//throw new IOException();
	}
	
	public void display(){
		System.out.println("display in Parent");
	}
}


class Child extends Parent {
	public Child() throws IOException{
		//super();
		try{
			//super();
			//super();
			//new IOException();
		}catch(Exception e){
			System.out.println("in catch of Child: "+e);
		}
	}
	
	public void display(){
		System.out.println("display in Child");
	}
}
