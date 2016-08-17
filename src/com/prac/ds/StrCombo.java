package com.prac.ds;

public class StrCombo {
	static String input = "CAC";
	public static void main(String[] args) {
		
		String str = "ACC";
		//premuteIt("", str);
		//testCATech();
		System.out.println(isAnagram("", str));
		 
	}

	private static void testCATech() {
		String s1 = "hello";
		String s2 = new String("hello");
		String s3 = "hello";
		System.out.println(s1 == s2);
		System.out.println(s1 == s3);
		
	}

	private static void premuteIt(String soFar, String rest) {
		//base case - exit condition
		if(rest.equals("")){
				System.out.println(soFar);
		}else{
			for (int i = 0; i < rest.length(); i++) {
				String next = soFar + rest.charAt(i);
				String remaining = rest.substring(0, i) + rest.substring(i+1);
				//System.out.println("calling again with "+next+" "+remaining);
				premuteIt(next, remaining);
			} 
		}
	}
	
	private static boolean isAnagram(String soFar, String rest) {
		//base case - exit condition
		if(soFar.equals(input)){
		//if(rest.equals("")){ //soFar.equals(input)){ //rest.equals("")){
				System.out.println(soFar+" "+input);				
					return true;
				
		}else{
			for (int i = 0; i < rest.length(); i++) {
				String next = soFar + rest.charAt(i);
				String remaining = rest.substring(0, i) + rest.substring(i+1);
				//System.out.println("calling again with "+next+" "+remaining);
				if(isAnagram(next, remaining))
					return true;
			} 
		}
		
		return false;
	}

}
