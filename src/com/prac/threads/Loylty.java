package com.prac.threads;

import java.util.ArrayList;

public class Loylty extends Thread {

	public void run(){
		System.out.println("running");
	}
	private static void display(){
		System.out.println("displaying");
	}
	public static void main(String[] args) {
		Thread t = new Loylty();
		t.start();
		
		Thread t1 = new Thread();
		t1.start(); //this wont do anything
		//System.out.println("at the End.");
		
		ArrayList<Integer> list = new ArrayList<Integer>(10); //defalt is 10 only
		list.add(1);
		list.add(2);
		list.add(3);
		for (int i = 0; i < 5; i++) {
			//System.out.println(list.get(i));
		}
		
		Loylty obj = null;
		obj.display();
		
		
		String o1 = new String("Shailendra");
		String o2 = new String("Shailendra");
		String o3 = "Shailendra";
		String o4 = "Shailendra";
		String o5 = o3;
		String o6 = o1;
		
		if(o1.equals(o2))
			System.out.println("equal");
		else
			System.out.println("o1 and o2 not equal");
		
		if(o5 == o3)
			System.out.println("o5 and o3 points to same object");
		
		if(o4 == o3)
			System.out.println("o4 and o3 points to same object");
		
		if(o5 == o4)
			System.out.println("o5 and o4 points to same object");
	}
	
}
