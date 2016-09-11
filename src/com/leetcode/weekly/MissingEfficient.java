package com.leetcode.weekly;

public class MissingEfficient {

	public static void main(String[] args) {
		//System.out.println(0x55555555);
		System.out.println(highestOneBit(10));
		System.out.println(lastRemaining(13));
	}
	
	public static int highestOneBit(int i) {
        // HD, Figure 3-1
        i  = i | (i >>  1);
        System.out.println(Integer.toBinaryString(i));
        i  = i | (i >>  2);
        System.out.println(Integer.toBinaryString(i));
        i  = i | (i >>  4);
        System.out.println(Integer.toBinaryString(i));
        i  = i | (i >>  8);
        System.out.println(Integer.toBinaryString(i));
        i  = i | (i >> 16);
        System.out.println(Integer.toBinaryString(i));
        
        return i - (i >>> 1);
    }
	
	  public static int lastRemaining(int n) {
	        boolean left = true;
	        int remaining = n;
	        int step = 1;
	        int head = 1;
	        while (remaining > 1) {
	            if (left || remaining % 2 ==1) {
	                head = head + step;
	            }
	            remaining = remaining / 2;
	            step = step * 2;
	            left = !left;
	        }
	        return head;
	    }

}
