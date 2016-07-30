package com.xpanxion.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//@Component
public abstract class RequestProcessor {
	
	//@Autowired
	ResourceA beana;
	
	public RequestProcessor(){
		System.out.println("creating requestProcessor");
		
	}
	
	ResourceB resourceB;
	
	//@Autowired
	public void setResourceB(ResourceB resourceB){
		System.out.println("setting resourceB");
		this.resourceB = resourceB;
	}
	
	public ResourceB getResourceB(){
		return resourceB;
	}

	public ResourceA getResourceA(){
		return beana;
	}
}
