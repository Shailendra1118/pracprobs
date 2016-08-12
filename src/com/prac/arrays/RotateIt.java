package com.prac.arrays;

import java.util.Arrays;

public class RotateIt {

	public static void main(String[] args) {
		int arr[] = {0,1,2,3,4,5,6};
		int order = 2;
		int len = arr.length;
		
		int arr1[] = new int[arr.length-order];
		System.arraycopy(arr, 0, arr1, 0, arr.length-order);
		System.out.println(Arrays.toString(arr1));
		reverse(arr1);
		System.out.println("reverse "+Arrays.toString(arr1));
		
		int arr2[] = new int[order];
		System.arraycopy(arr, arr1.length, arr2, 0, order);
		System.out.println(Arrays.toString(arr2));
		reverse(arr2);
		System.out.println("reverse "+Arrays.toString(arr2));
		
		System.out.println("Finally "+Arrays.toString(reverse(arr2))+Arrays.toString(reverse(arr1)));

	}

	private static int[] reverse(int[] arr) {
		int i = arr.length-1;
		int j = 0;
		while(j<i){
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			j++;
			i--;
		}
		//System.out.println("After reverse "+Arrays.toString(arr));
		return arr;
	}

}
