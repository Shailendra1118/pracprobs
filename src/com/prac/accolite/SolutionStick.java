package com.prac.accolite;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SolutionStick {

    public static void main(String[] args) throws FileNotFoundException {
        //Scanner in = new Scanner(System.in);
    	Scanner in = new Scanner(new File("D:\\Keppler\\CrazyCode\\src\\com\\prac\\accolite\\sticks.txt"));//new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        while(isRemaining(arr)){
            int min = findMin(arr);
            if(min == 0)
            	break;
            int res = 0;
            for(int i=0; i<arr.length; i++){
                if(arr[i] > 0 ){                    //simplified arr[i] != 0 && arr[i] >= min
                    arr[i] = arr[i]-min;
                    res++;                    
                }
            }
            System.out.println(res);
            //count--;
        }
        in.close();
    }
    
    private static int findMin(int arr[]){
        int min = arr[0]; 
        for(int i=1; i<arr.length; i++){        	
            if(arr[i] != 0 && arr[i] < min){
                min = arr[i]; 
            } 
            if(min == 0) //corner case when last element is left
        		min = arr[i];
        }
        //System.out.println("min-"+min);
        return min;
    }
    
    private static int findMin1(int arr[]){
    	int mn = arr[0];
    	 for(int i = 1; i < arr.length; ++i) {
             if(arr[i] > 0)
                 mn = Math.min(mn, arr[i]);
         }
    	 return mn;
    }
    
    private static boolean isRemaining(int arr[]){
        int count = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] >0)
                count++;
        }
        if(count >0)
            return true;
        else
            return false;
    }
}
