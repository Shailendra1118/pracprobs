package com.frmwrk.prac;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class AutoTest {

	public static void main(String[] args) {
		Scanner in = null;
		try {
			in = new Scanner(new File("D:/Keppler/CrazyCode/src/com/frmwrk/prac/input.txt"));
			 int n = in.nextInt();
		        int A[] = new int[n];
		        for(int A_i=0; A_i < n; A_i++){
		            A[A_i] = in.nextInt();
		        }
		        Map<Integer,Integer> map = new HashMap<Integer,Integer>();  
		        int res = putInMap(A,map);
		        System.out.println(res);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println("diff "+process(1012));
		in.close();
	}
	
	private static int process(int n){
        int num = n;
        int cnt = 0;
        while(num/10 != num){
            int d = num%10;
            if(d != 0 && n%d == 0)
                cnt++;
            num = num/10;
        }
        return cnt;
    }

	private static int putInMap(int arr[], Map<Integer, Integer> map){
        int min = 99999;
        for(int i=0; i<arr.length; i++){
            if(map.containsKey(arr[i])){
                int idx = map.get(arr[i]);
                if(min > (i-idx)){                	
                    min = i-idx;
                    System.out.println("min updated to: "+arr[i]+":"+min);
                }
                map.put(arr[i], i);
            }else{
                map.put(arr[i], i);
            }
        }
        Iterator<Entry<Integer,Integer>> iter = map.entrySet().iterator();
        while(iter.hasNext()){
            Entry<Integer,Integer> ent = iter.next();
            System.out.println(ent.getKey()+"-"+ent.getValue());
        }
        return min;
    }

}
