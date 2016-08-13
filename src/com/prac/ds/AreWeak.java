package com.prac.ds;

import java.util.WeakHashMap;

public class AreWeak {
	
		public static void main(String[] args) throws InterruptedException {
		
		WeakHashMap<MyKeys,String> map = new WeakHashMap<>();
		MyKeys o1 = new MyKeys("Hello1");
		map.put(o1, "value1");
		MyKeys o2 = new MyKeys("Hello2");
		map.put(o2, "value2");
		MyKeys o3 = new MyKeys("Hello3");
		map.put(o3, "value3");
		MyKeys o4 = new MyKeys("Hello4");
		map.put(o4, "value4");
		
		Thread t = new Thread(new Runnable(){

			@Override
			public void run() {
				while(true){
					System.out.println(map.size());					
				}
					
			}
			
		});
		t.start();
		
		Thread.sleep(2000);
		while(true){
			System.out.println("checkin in map.."+map.get(o2));
			
			
		}
	}
	
	
		static class MyKeys{
			String name;
			MyKeys(String name){
				this.name = name;
			}
		}



}
