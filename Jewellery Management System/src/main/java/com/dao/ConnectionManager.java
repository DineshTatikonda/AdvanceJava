package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionManager {
	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		String driver="com.mysql.cj.jdbc.Driver";
		String url="jdbc:mysql://localhost:3306/jewellerymanagement";
		String username="root";
		String password="test123";
		
		
		Class.forName(driver);
		Connection connection=DriverManager.getConnection(url, username, password);
		connection.setAutoCommit(false);
		
		return connection;
		
	}

}