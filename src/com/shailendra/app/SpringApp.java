package com.shailendra.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.shailendra.app.dao.CustomerDAO;
import com.shailendra.app.model.Customer;

public class SpringApp {
	public static void main(String args[]){

		@SuppressWarnings("resource")
		ApplicationContext context =
	    		new ClassPathXmlApplicationContext("appContext.xml");
	
	        CustomerDAO customerDAO = (CustomerDAO) context.getBean("customerDao");
	        Customer customer = new Customer(1, "Shailendra",28);
	        //customerDAO.insertCustomer(customer);
	
	        Customer cust = customerDAO.findByCustomerId(1);
	        System.out.println(cust.getCustId()+":"+cust.getName()+":"+cust.getAge());
	}
}
