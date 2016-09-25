package com.xpanxion.demo;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ResourceA implements InitializingBean, DisposableBean {
	String url ="http://localhost:8080";
	
	@Autowired
	private ResourceC resourceC;
	
	String defaultValue = "default";
	
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
		System.out.println("defaultValues-"+defaultValue);
		defaultValue = "nothing";
		return this.name;
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("destroying resources "+defaultValue);
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("after setting property");
		System.out.println("defaultVal "+defaultValue);
		defaultValue = "Masakali";
		System.out.println("defaultVal "+defaultValue);
	}
}
