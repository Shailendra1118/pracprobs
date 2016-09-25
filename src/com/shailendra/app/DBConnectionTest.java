package com.shailendra.app;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Iterator;

public class DBConnectionTest {

	public final static String DB_DRIVER_CLASS = "com.mysql.jdbc.Driver";
	public final static String DB_URL = "jdbc:mysql://localhost:3306/test";
	public final static String DB_USERNAME = "root";
	public final static String DB_PASSWORD = "root";

	public static Connection getConnection() throws ClassNotFoundException, SQLException {

		Connection con = null;

		// load the Driver Class Not required with new jdbc drivers
		//Class.forName(DB_DRIVER_CLASS);

		// create the connection now
		con = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);

		System.out.println("DB Connection created successfully");
		return con;
	}
	
	public static void main(String args[]){
		try {
			Connection con = getConnection();
			System.out.println("AutoCommit mode- "+con.getAutoCommit());
			System.out.println("Transaction isolation "+con.getTransactionIsolation()); //4
			//System.out.println("Schema "+con.getSchema());
			DatabaseMetaData meta = con.getMetaData();
			System.out.println("default Tx "+meta.getDefaultTransactionIsolation()); //2
			System.out.println("support "+meta.supportsTransactions());
			System.out.println("read_uncommitted supports:"+meta.supportsTransactionIsolationLevel(1));
			System.out.println("read_committed supports:"+meta.supportsTransactionIsolationLevel(2));
			System.out.println("repeatable_read supports:"+meta.supportsTransactionIsolationLevel(3));
			System.out.println("serializable supports:"+meta.supportsTransactionIsolationLevel(4));
			System.out.println("testing supports: 0 "+meta.supportsTransactionIsolationLevel(0)+", 5"+
					meta.supportsTransactionIsolationLevel(5));
			
			System.out.println(meta.supportsResultSetType(1));
			System.out.println(meta.supportsResultSetType(2));
			System.out.println(meta.supportsResultSetType(3));
			
			Iterator iter = con.getClientInfo().entrySet().iterator();
			while(iter.hasNext()){
				System.out.println(iter.next());
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
	}
}
