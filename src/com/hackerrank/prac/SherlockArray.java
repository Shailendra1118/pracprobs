package com.hackerrank.prac;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SherlockArray {

	public static void main(String[] args) {
		Scanner scanner = null;
		try {
			scanner = new Scanner(new File("D:/Keppler/CrazyCode/src/com/hackerrank/prac/input.txt"));
			int tcSize = scanner.nextInt();
	        // System.out.println("tcSize "+tcSize);
	        long sum = 0;
	        int arr[] = null;
	        for(int i=0; i<tcSize; i++){
	            int size = scanner.nextInt();          
	            //System.out.println("size "+size);
	            arr = new int[size];
	            for(int j=0; j<size; j++){
	                arr[j] = scanner.nextInt();
	                sum = sum + arr[j]; 
	                //System.out.println("sum: "+sum);
	            }
	            //System.out.println("calling method at "+i+" th time");
	            //System.out.println(i+" th sum is "+sum);
	            numExist(arr, sum);
	            sum = 0;
	            //System.out.println("Done "+i+" th call");
	        }
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}
	
	  private static void numExist(int arr[], long sum){
		  
	        long prevSum = 0;
	        boolean flag = false;
	        for(int k=0; k<arr.length; k++){	            
	            if(prevSum == (sum-(arr[k]+prevSum))){
	                System.out.println("YES");
	                flag = true;
	                break;
	            }   
	            prevSum = prevSum + arr[k];
	        }
	        if(!flag)
	            System.out.println("NO");
	    }

}
