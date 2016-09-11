package com.atlas.probs;

import java.util.Arrays;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

public class Cutlery {

	public static void main(String[] args) {
		int arr[] =  {2,5,8,11,23,55,56,77,89};
		binSearch(arr);
	}

	private static void binSearch(int[] arr) {
		ForkJoinPool pool = new ForkJoinPool(5);
		FJSearcher searcher = new FJSearcher(arr, 100);
		System.out.println(pool.invoke(searcher));
		
	}

}

@SuppressWarnings("serial")
class FJSearcher extends RecursiveTask<Boolean>{

	private int arr[];
	private int num;
	@Override
	protected Boolean compute() {
		int mid = this.arr.length/2;
		if(arr[mid] == num){
			System.out.println(Thread.currentThread()+" executing");
			System.out.println("Num found !!");
			return true;
		}else if(mid == 1 || mid == arr.length){
			System.out.println("Not Found !!");
			return false;
		}
		else if(arr[mid] < num){
			int right[] = Arrays.copyOfRange(arr, mid, arr.length);
			FJSearcher forkTask = new FJSearcher(right, num);
			System.out.println(Thread.currentThread()+" before forking right search");
			forkTask.fork();
			System.out.println(Thread.currentThread()+" after forking");
			return forkTask.join();
		}
		else if(arr[mid] > num){
			int left[] = Arrays.copyOfRange(arr, 0, mid);
			FJSearcher forkTask = new FJSearcher(left, num);
			System.out.println(Thread.currentThread().getId()+" before forking left search");
			forkTask.fork();
			System.out.println(Thread.currentThread()+" after forking");
			return forkTask.join();
		}
		return false;
	}
	
	public FJSearcher(int arr[], int num){
		this.arr = arr;
		this.num = num;
	}
	
}