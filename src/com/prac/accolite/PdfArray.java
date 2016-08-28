package com.prac.accolite;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PdfArray {

	public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("D:\\Keppler\\CrazyCode\\src\\com\\prac\\accolite\\input.txt"));//new Scanner(System.in);
        int n = 26;
        int h[] = new int[n];
        for(int h_i=0; h_i < n; h_i++){
            h[h_i] = in.nextInt();
        }
        String word = in.next();
        int ht = findMaxHeight(word, h);
        System.out.println(ht*word.length()*1);
        
        
        in.close();
    }
    
    private static int findMaxHeight(String word, int[] h){
        int maxh = 0;
        for(int i=0; i<word.length(); i++){
        	//System.out.println(word.charAt(i));
            int cur = word.charAt(i)-'a'; 
            if(h[cur] > maxh)
                maxh = h[cur];
        }
        return maxh;
    }

}
