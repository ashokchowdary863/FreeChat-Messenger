package com.ashok.dev.Messenger_JAX_RS.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.ashok.dev.Messenger_JAX_RS.Models.User;
import com.ashok.dev.Messenger_JAX_RS.Utils.ConnectionHelper;

public class UsersDAO {
	public ArrayList<User> getUsers() throws ClassNotFoundException, SQLException{
		ArrayList<User> users=new ArrayList<User>();
		Connection connection=new ConnectionHelper().getConnection();
		Statement statement=connection.createStatement();
		ResultSet resultSet=statement.executeQuery("select * from users");
		while(resultSet.next()){
			User user=new User(resultSet.getInt("user_id"),resultSet.getString("username"),resultSet.getString("firstname"),resultSet.getString("lastname"),resultSet.getDate("last_login_datetime"));
			users.add(user);
		}
		return users;
	}
}
