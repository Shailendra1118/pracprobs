package com.shailendra.app.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//@Component
public class BService {
	
	//@Autowired
	private AService aService;
	
//	public BService(){
//		System.out.println("default BService constr");
//	}
	
	//@Autowired
	public BService(AService aService){
		System.out.println("BService contsturtor");
		this.aService = aService;
	}
	
	//public void setAService(AService service){
	//	this.aService = service;
	//}
	
	public void update(Customer cust){
		System.out.println("Bservice updating customer calling A's");
		aService.update(cust);
	}
	
	public void display(){
		System.out.println("Bservice display");
	}
}
