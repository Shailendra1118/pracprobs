package com.shailendra.app.model;

import org.springframework.context.ApplicationContext;

public class CycleBoot {
	private ApplicationContext ctx = null;
	public CycleBoot(ApplicationContext ctx){
		this.ctx = ctx;
	}
	
	public CycleBoot(){
		System.out.println("default contrucutoer boot");
	}
	
	public void start(){
		AService service = ctx.getBean(AService.class);
		service.display();
	}
}
