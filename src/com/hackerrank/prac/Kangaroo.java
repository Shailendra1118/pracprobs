package com.hackerrank.prac;


public class Kangaroo {

	public static void main(String[] args) {
       /* Scanner in = new Scanner(System.in);		
        int x1 = in.nextInt();
        int v1 = in.nextInt();
        int x2 = in.nextInt();
        int v2 = in.nextInt();
        checkIt(x1,x2,v1,v2);
        */
        checkIt(Integer.valueOf(args[0]),Integer.valueOf(args[2]),
        		Integer.valueOf(args[1]),Integer.valueOf(args[3]));
    }
    
    private static void checkIt(int x1, int x2, int v1, int v2) {
         if( ((x1<x2) && (v1<v2)) || ((x2<x1 && (v2<v1))) ){
            System.out.println("NO");
             return;
        }
        else if( (v2 == v1) && (x2<x1 || x1<x2) ){
            System.out.println("NO");
            return;
        }else{
             x1 = x1 + v1;
             x2 = x2 + v2;
             if(x1 == x2){
                 System.out.println("YES"); 
                 return;
             }else{
                 checkIt(x1, x2, v1, v2);
             }
        }
    }

}
