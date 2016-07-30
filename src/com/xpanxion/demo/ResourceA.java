package com.xpanxion.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ResourceA {
	String url ="http://localhost:8080";
	
	@Autowired
	private ResourceC resourceC;
	
	public void setResourceC(ResourceC rC){
		System.out.println("...setting rC....");
		this.resourceC = rC;
	}
	
	public ResourceA(){
		System.out.println("resourceA constructor");
	}
	
	public String getUrl() {
		return url;
	}
	
	String name;
	public void setName(String name){
		this.name = name;
	}
	
	public String getName(){
		System.out.println(resourceC.getSomeFun());
		return this.name;
	}
}
