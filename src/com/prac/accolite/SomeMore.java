package com.prac.accolite;

public class SomeMore {

	public static void main(String[] args) {
		try{
			Error error = new Error("Watch your code idiot !");
			throw error;
		}catch(Throwable e){
			System.out.println(e.getMessage());
			throw e;
		}
	}
	
	static void testDivideByZero(){
		int x = 0;
		int y = 12/x; // even 12/0 will not give compilation error because it done evaluate expression 
						// in compile time dear
		System.out.println(y);
	}

}
