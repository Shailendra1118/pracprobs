package com.prac.ds;

import java.util.Arrays;

public class HeapSorting {

	static int heap[] = new int[7];
	public static void main(String[] args) {
		int arr[] = {2,4,1,3,5,7};		
		heapSort(arr);
	}

	private static void heapSort(int[] arr) {
		//heap[0] = 0;
		for (int i = 0; i < arr.length; i++) {
			heap[i+1] = arr[i];
		}
		//heapify(heap, heap.length);
		buildHeap(heap);
		
	}

	private static void heapify(int[] heap, int heapSize) {
		for(int i = heapSize-1; i >0; i--) {
			int cur = i;
			//int size = heap.length;
			int prnt = cur/2;;
			while(cur > 1 && cur > prnt){
				if(heap[cur] > heap[prnt]){
					int temp = heap[cur];
					heap[cur] = heap[prnt];
					heap[prnt] = temp;					
				}else
					break;
				
				cur = prnt;
				prnt = cur/2;
				
			}
			System.out.println(Arrays.toString(heap));
		}
	}
	
	private static int heapifyDispatcher(int heap[], int heapSize){
		//minimal data set
		if(heapSize == 0)
			return 0;
		//calculation with non-minimal data set
		int cur = heap[heapSize-1];
		int parent = heapSize/2;
		
		
		return heapSize;
		
	}
	
	private static void maxHeapify(int arr[], int idx, int N){
			int largest = -1;
				int left = 2*idx;                   //left child
			    int right = 2*idx +1;           //right child
			    if(left<= N && arr[left] > arr[idx] )
			          largest = left;
			    else
			         largest = idx;
			    
			    if(right <= N && arr[right] > arr[largest] )
			        largest = right;
			    
			    if(largest != idx )
			    {
			    	int temp = arr[idx];
					arr[idx] = arr[largest];
					arr[largest] = temp;	
			       // swap (arr[idx] , arr[largest]);
					maxHeapify (arr, largest,N);
			    } 
	}
	
	private static void buildHeap(int arr[]){
		int n = arr.length-1/2;
		for (int i = n; i > 0; i--) {
			maxHeapify(arr, i, arr.length-1);
			System.out.println(Arrays.toString(arr));
		}
	}

}
