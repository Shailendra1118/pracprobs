package com.shailendra.app.dao;

import com.shailendra.app.model.Customer;

public interface CustomerDAO {

	public void insertCustomer(Customer cust);
	public Customer findByCustomerId(int custId);
	
}
