package com.prac.arrays;

import java.util.Arrays;

public class SortZeros {

	public static void main(String[] args) {
		int arr[] = {0,1,2,0,1,0,2,1};
		int i = 0;
		int j = arr.length-2;
		int k = arr.length-1;
		
		while(i < j && j < k){
			if(arr[i] > arr[j]){
				int temp = arr[j];
				arr[j] = arr[i];
				arr[i] = temp;
				if(arr[j] > arr[k]){
					temp = arr[k];
					arr[k] = arr[j];
					arr[j] = temp;
					k--;
				}
				i++;
				//j--;
			}else{
				if(arr[j] > arr[k]){
					int temp = arr[k];
					arr[k] = arr[j];
					arr[j] = temp;
					k--;
				}
				j--;
				
			}
		}
		
		System.out.println(Arrays.toString(arr));
	}

}
