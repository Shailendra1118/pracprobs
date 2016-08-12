package com.prac.ds;

import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6,7,8,9,10};
		
		reverseIt(arr, 0, arr.length-1);
		System.out.println(Arrays.toString(arr));
	}

	private static void reverseIt(int[] arr, int i, int j) {
		//System.out.println("i-"+i+" j-"+j);
		if(i >= j){ //corner case this is where interesting things happen
			return;
		}
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		reverseIt(arr, ++i, --j);
	}

}
