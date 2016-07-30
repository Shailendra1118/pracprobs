package com.xpanxion.demo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Tesing {
	
	//@Autowired
	//static RequestProcessor processor;
	
	
	
	public static void main(String args[]){
		ApplicationContext context = new FileSystemXmlApplicationContext("D:\\Keppler\\CrazyCode\\appContext.xml");
	/*	RequestProcessor processor = (RequestProcessor)context.getBean("RequestProcessor"); //processor
		for (int i=0;i<3;i++){
			ResourceA resource = processor.getResourceA();
			System.out.println(resource.getUrl());
		}
		for (int i=0;i<3;i++){
			ResourceB resource = processor.getResourceB();
			System.out.println(resource.getUrl());
		} */
		
		//System.out.println(processor.getResourceA().getUrl());
		//System.out.println(processor.getResourceB().getUrl());
		
		//ResourceA a = processor.getResourceA(); //.setName("Baloo");
		//a.setName("Shailendra");
		BeanFactory factory = context;
		ResourceA rA = (ResourceA) factory.getBean("resourceA");
		rA.getName();
		//ResourceA b = processor.getResourceB();
		//System.out.println(processor.getResourceA().getName());
		//System.out.println(a.rC.getSomeFun());
	}
}
