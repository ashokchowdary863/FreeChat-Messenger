package com.ashok.dev.Messenger_JAX_RS.Utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionHelper {
	public Connection getConnection() throws SQLException, ClassNotFoundException{
		Class.forName("com.mysql.jdbc.Driver");
		try {
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/messenger","root","ashok123");
			return  connection;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
