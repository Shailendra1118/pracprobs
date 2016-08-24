package com.sabre.sober;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BinarySearch {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("San Fransisco");
		list.add("Bombay");
		list.add("New York");
		list.add("Pune");
		
		System.out.println(list.toString());
		Collections.sort(list, new Comparator<String>() {  //to work it correctly it should be sorted 
			// ascending 
			@Override
			public int compare(String o1, String o2) {
				return o2.compareTo(o1); //here o2 makes it descending comparing to o1
			}
		});
		System.out.println("After sorting: "+list.toString());
		System.out.println(Collections.binarySearch(list,"Bombay"));
		
		List<Plant> list1 = new ArrayList<Plant>();
		list1.add(new Tree());
		List<? extends Plant> alist = list1;
		System.out.println(alist.get(0)); 
		//alist.add(new Tree()); not applicable
		
		List<? super Plant> clist = list1;
		clist.add(new Tree());
		System.out.println("clist size: "+clist.size());
		
		List<Tree> list2 = new ArrayList<Tree>();
		list2.add(new Tree());
		List<? super Tree> blist = list2; //PECS producer is here ? extends Plants also works for getting
		System.out.println(blist.get(0));
		System.out.println(blist.add(new Tree())+", now size: "+blist.size());
	}

}

class Plant{
	public void display(){
		System.out.println("In Plants.");
	}
}

class Tree extends Plant{
	public void display(){
		System.out.println("In Trees.");
	}
}


