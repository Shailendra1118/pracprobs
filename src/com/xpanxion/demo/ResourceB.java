package com.xpanxion.demo;


//@Component
public class ResourceB {
	String url ="http://localhost:9090";
	public ResourceB(){
		System.out.println("resourceB constructor");
	}
	
	public String getUrl() {
		return url;
	}
}
