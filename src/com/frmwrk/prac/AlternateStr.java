package com.frmwrk.prac;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class AlternateStr {

	public static void main(String[] args) throws FileNotFoundException {
        Scanner in;
        in = new Scanner(new File("D:/Keppler/CrazyCode/src/com/frmwrk/prac/inputStr.txt"));
        int len = in.nextInt();
        String s = in.next();
        Set<Character> set = new HashSet<Character>();
        char arr[] = new char[26];
        for(int i=0; i<len; i++){
            set.add(s.charAt(i));
        }
        System.out.println(set.size());
        Iterator<Character>iter = set.iterator();
        int ctr = 0;
        while(iter.hasNext()){
            char c = iter.next();
            arr[ctr] = c;
            ctr++;
        }
        int max = 0;
        for(int j=0; arr[j] != Character.MIN_VALUE; j++){ //j<arr.length
            for(int k=j+1; arr[k] != Character.MIN_VALUE; k++){
            	char x = arr[j];
            	char y = arr[k];
                int curMax = checkStr(s, x, y); 
                if(max < curMax){
                    max = curMax;
                }
            }
        }
        
        System.out.println(max);
        in.close();
    }
    
    private static int checkStr(String s, char x, char y){
        int curMax = 0;
        if(s.indexOf(x) !=-1 || s.indexOf(y) != -1){
        	s = s.replace(x, ' ').replaceAll("\\s+", "");
        	s = s.replace(y, ' ').replaceAll("\\s+", "");
        }
        
        //check alternative
         char a = s.charAt(0);
         char b = s.charAt(1);
        boolean flagA = true;
        boolean flagB = true;
        if(a == b){
        	return curMax;
        }
        for(int j=0; j<s.length(); j++){
            if(s.charAt(j) != a){
                flagA = false; 
                break;
            }
            j = j+1;
        }
         for(int j=1; j<s.length(); j++){
            if(s.charAt(j) != b){
                flagB = false;
                break;
            }
            j = j+1;
        }
        
        if(flagA && flagB){
            curMax = s.length();
            System.out.println("string "+s);
        }
        
        return curMax;
    }
}
