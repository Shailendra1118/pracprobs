package com.java8.pracs;

import java.util.Arrays;

public class ConGreeter extends Greeter{
	public void greet(){
		Thread t = new Thread(super::greet); //method reference
		t.start();
	}
	
	public static void main(String args[]){
		new ConGreeter().greet();
		String[] arr = {"I", "am", "Don"};
		Arrays.sort(arr, String::compareToIgnoreCase);
		System.out.println(arr[0]+" & "+arr[1]+" & "+arr[2]);
	}
}

class Greeter{
	public void greet(){
		System.out.println("greetings sir !");
	}
}