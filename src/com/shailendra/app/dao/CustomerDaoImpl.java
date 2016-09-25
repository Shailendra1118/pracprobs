package com.shailendra.app.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.shailendra.app.model.Customer;

public class CustomerDaoImpl implements CustomerDAO{
	
	private DataSource datasource;
	
	public void setDatasource(DataSource dataSource){
		this.datasource = dataSource;
	}

	@Override
	public void insertCustomer(Customer customer){

		String sql = "INSERT INTO C_CUSTOMER " +
				"(CUST_ID, CUST_NAME, AGE) VALUES (?, ?, ?)";
		Connection conn = null;

		try {
			conn = datasource.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, customer.getCustId());
			ps.setString(2, customer.getName());
			ps.setInt(3, customer.getAge());
			ps.executeUpdate();
			ps.close();

		} catch (SQLException e) {
			throw new RuntimeException(e);

		} finally {
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {}
			}
		}
	}

	@Override
	public Customer findByCustomerId(int custId) {
		String sql = "SELECT * FROM C_CUSTOMER WHERE CUST_ID = ?";
		Connection conn = null;
		try {
			conn = datasource.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, custId);
			boolean flag = ps.execute();
			System.out.println("Got "+flag+" from execute()");
			Customer cust = null;
			ResultSet set = ps.executeQuery();
			while(set.next()){
				cust = new Customer(set.getInt("CUST_ID"), set.getString("CUST_NAME"), set.getInt("AGE"));
			}
			//ps.executeUpdate();
			set.close();
			ps.close();
			return cust;
		} catch (SQLException e) {
			throw new RuntimeException(e);

		} finally {
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {}
			}
		}
		
	}

}
