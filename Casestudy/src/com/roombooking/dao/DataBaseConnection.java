package com.roombooking.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class DataBaseConnection {
	public static Connection dbConnection() throws Exception{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","manager");
		return connection;
		
	}

}
