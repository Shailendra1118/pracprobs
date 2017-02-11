package com.calm.think;

import java.util.HashMap;
import java.util.Iterator;

public class HospitalController {

	static HashMap<Integer,Patient> map = new HashMap<>();
	public static void main(String[] args) {
		
		//int arr[] = {12,34,55,3,13,4,56,77,1,45};
		Patient arr[] = new Patient[10];
		
		
		for(int i=0; i<arr.length; i++){
			Patient newPatient = new Patient(new Integer(5),"Patient"+i);
			System.out.println("New patient came with "+newPatient.criticality+" "+newPatient.name);
			processIt(newPatient);
			//get most critical patient
			Patient s = map.get(getMostCritial());
			System.out.println("Now most critical patient is "+s.criticality+" "+s.name);
		}
		
	}
	private static Integer getMostCritial() {
		Iterator<Integer> iter = map.keySet().iterator();
		int max = Integer.MIN_VALUE;
		int now = Integer.MIN_VALUE;;
		while(iter.hasNext()){
			now = iter.next();
			if(now > max)
				max = now;
		}
		System.out.println("Max is: "+max);
		return max;
	}
	private static void processIt(Patient p) {
		map.put(p.criticality, p);
	}

	static class Patient{
		int criticality;
		String name;
		
		Patient(int c, String n){
			this.criticality = c;
			this.name = n;
		}
		
		public int hashCode(){
			return criticality;			
		}
		
		public boolean equals(Object o){
			if(o == null | this == null)
				return false;
			else{
				if(o.getClass().equals(this.getClass())){
					Patient other = (Patient)o;
					if(other.name.equals(this.name) && other.criticality == this.criticality)
						return true;					
				}
			}
			return false;
				
		}
	}
}

