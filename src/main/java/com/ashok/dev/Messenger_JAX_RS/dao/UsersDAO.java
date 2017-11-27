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
		Connection connection=null;
		Statement statement=null;
		ResultSet resultSet=null;
		try{
		 connection=new ConnectionHelper().getConnection();
		 statement=connection.createStatement();
		 resultSet=statement.executeQuery("select * from users");
		while(resultSet.next()){
			User user=new User(resultSet.getInt("user_id"),resultSet.getString("username"),resultSet.getString("firstname"),resultSet.getString("lastname"),resultSet.getString("last_login_datetime"),resultSet.getString("gender"),resultSet.getString("email"),resultSet.getString("mobile"));
			users.add(user);
		}
		resultSet.close();
		statement.close();
		connection.close();
		}catch(Exception sqlException){
			resultSet.close();
			statement.close();
			connection.close();
		}
		return users;
		
	}
	
	public User getUserInformation(String userName) throws SQLException{
		User user=null;
		Connection connection=null;
		Statement statement=null;
		ResultSet resultSet=null;
		try{
		 connection=new ConnectionHelper().getConnection();
		 statement=connection.createStatement();
		 resultSet=statement.executeQuery("select * from users where username='"+userName+"'");
		while(resultSet.next()){
			 user=new User(resultSet.getInt("user_id"),resultSet.getString("username"),resultSet.getString("firstname"),resultSet.getString("lastname"),resultSet.getString("last_login_datetime"),resultSet.getString("gender"),resultSet.getString("email"),resultSet.getString("mobile"));
		}
		resultSet.close();
		statement.close();
		connection.close();
		}catch(Exception sqlException){
			resultSet.close();
			statement.close();
			connection.close();
		}
		return user;
	}
	
	public ArrayList<User> getRecentActiveUsers() throws SQLException{
		ArrayList<User> users=new ArrayList<User>();
		Connection connection=null;
		Statement statement=null;
		ResultSet resultSet=null;
		try{
		 connection=new ConnectionHelper().getConnection();
		 statement=connection.createStatement();
		 resultSet=statement.executeQuery("select * from users order by last_login_datetime DESC limit 5");
		while(resultSet.next()){
			User user=new User(resultSet.getInt("user_id"),resultSet.getString("username"),resultSet.getString("firstname"),resultSet.getString("lastname"),resultSet.getString("last_login_datetime"),resultSet.getString("gender"),resultSet.getString("email"),resultSet.getString("mobile"));
			users.add(user);
		}
		resultSet.close();
		statement.close();
		connection.close();
		}catch(Exception sqlException){
			resultSet.close();
			statement.close();
			connection.close();
		}
		return users;
		
	}
}
