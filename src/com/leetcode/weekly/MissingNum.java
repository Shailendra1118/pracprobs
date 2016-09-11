package com.leetcode.weekly;

import java.util.Arrays;

public class MissingNum {

	public static void main(String[] args) {
		int n = 663;
		//System.out.println(1%2);
		int remain = lastRemaining(n);
		System.out.println(remain);
	}
	
	public static int lastRemaining(int n) {
		int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
			arr[i] = i+1;
		}
        System.out.println(Arrays.toString(arr));
        
        int turn = 1;
        boolean flag = true;
        boolean exit = true;
        while(exit){        	
        	if(flag){
        		int idx = 0;
        		for (int i = 0; i < arr.length; i++) {
        			//if(hasLastPositive(arr)){
        			//	exit = false;
        			//	break;
        			//}
					if(arr[i] > 0){
						if(idx%2 == 0){
        					arr[i] = -turn;
        				}
						idx++;
					}
					
				}
        		flag = false;
        	}else{
        		int idx = 0;
        		for (int i = arr.length-1; i >= 0; i--) {        			
        			if(arr[i] > 0){
        				if(idx%2 == 0){
        					arr[i] = -turn;
        				}
        				idx++;        				
        			}
				}
        		flag = true;
        	}
        	turn++;
        	System.out.println(Arrays.toString(arr));
        }
        
        //System.out.println("final: "+Arrays.toString(arr));
		return findPositive(arr);
    }

	private static int findPositive(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] > 0){
				return arr[i];
			}	
		}
		return 0;
	}

	private static boolean hasLastPositive(int[] arr) {
		int ctr = 0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] > 0){
				ctr++;
			}	
		}
		if(ctr > 1)
			return false;
		return true;
	}

	

}
