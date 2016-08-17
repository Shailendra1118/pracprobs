package com.prac.ds;

import java.util.ArrayList;

public class ITrading {

	static ArrayList<Integer> list = new ArrayList<>();
	static int arr[] = {15, 8, 3, 12, 2}; 
	
	public static void main(String[] args) {	
		for (int i = 0; i < arr.length; i++) {
			list.add(arr[i]);
		}
		System.out.println(iSum(0, list));
	}

	private static boolean iSum(int num, ArrayList<Integer> restArray) {		
		if(num == 25){
			System.out.println("Answer"+ restArray.toString());
			return true;
		}else{		
			for (int j = 0; j < restArray.size(); j++) {
				System.out.println("num: "+num+" restArray["+j+"]: "+restArray.get(j));
				
				int soFar = num + restArray.get(j);
				ArrayList<Integer> remaining = new ArrayList<>();
				remaining.addAll(restArray);
				remaining.remove(restArray.get(j));
				//System.out.println("Remaining: "+remaining.toString());
				if(iSum(soFar, remaining))
					return true;
			}
		}
		
		return false;
	}

	
}
