package com.leetcode.weekly;

public class RepeatNum {

	public static void main(String[] args) {
		int nums[] = {2,3,5,2,3};
		int res = singleNumber(nums);
		System.out.println("missing num: "+res);
		int num3[] = {2,3,2,2};
		System.out.println("missing : "+threeTimes(num3));
	}
	
	 	private static int threeTimes(int[] num3) {
	 		int res = 0;
	        for(int i=0; i<num3.length; i++){
	            res = res^num3[i];
	        }
	        System.out.println(res);
		return -1;
	}

		static public int singleNumber(int[] nums) {
	        int res = 0;
	        for(int i=0; i<nums.length; i++){
	            res = res^nums[i];
	        }
	        System.out.println(res);
	        return res;
	    }

}
