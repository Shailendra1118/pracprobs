package com.sabre.annotation;


public class MyEntity {

	@TimeWatch
	public void display(){
		System.out.println("some display processing...");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}		
	}
}
