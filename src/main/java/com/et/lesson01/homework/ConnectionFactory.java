package com.et.lesson01.homework;

import java.sql.DriverManager;
import com.mysql.jdbc.Connection;

public class ConnectionFactory {
	public Connection createConnection() throws Exception{
		 Connection connection =(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "123456");
		return connection;
		
	}
}
