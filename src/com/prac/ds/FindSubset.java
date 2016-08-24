package com.prac.ds;

public class FindSubset {

	public static void main(String[] args) {
		int arr[] = {3, 34, 4, 12, 5, 2};
		int sum = 9;
		System.out.println(isSubset(arr, arr.length, sum));

	}

	private static boolean isSubset(int[] arr, int no, int sum) {
		
		if(sum == 0)
			return true;
		
		if(no == 0 && sum > 0)
			return false;
		
		if(arr[no-1] > sum){
			System.out.println("arr["+no+"-1]"+arr[no-1]);
			return isSubset(arr, no-1, sum);
		}
		
		return isSubset(arr, no-1, sum) || isSubset(arr, no-1, sum-arr[no-1]);
	}

}
