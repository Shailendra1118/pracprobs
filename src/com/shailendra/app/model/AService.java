package com.shailendra.app.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AService {
	
	//@Autowired
	private BService bService;
	
//	public AService(){
//		System.out.println("Default AService contr");
//	}
	
	@Autowired
	public AService(BService bService){
		System.out.println("AService contsturtor");
		this.bService = bService;
	}
	
	// void setBService(BService service){
	//	this.bService = service;
	//}
	
	public void update(Customer cust){
		System.out.println("Aservice updating customer..");
	}
	
	public void display(){
		System.out.println("Aservice display calling B's");
		bService.display();
	}
}
