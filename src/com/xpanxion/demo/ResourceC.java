package com.xpanxion.demo;

import org.springframework.stereotype.Component;

@Component
public class ResourceC {
	
	public ResourceC(){
		
		System.out.println("ResourceC constructor");
	}
	
	public int getSomeFun(){
		System.out.println("in your face");
		return 100;
	}

}
