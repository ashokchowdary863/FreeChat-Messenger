package com.ashok.dev.Messenger_JAX_RS.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.ashok.dev.Messenger_JAX_RS.Models.Message;
import com.ashok.dev.Messenger_JAX_RS.Models.User;
import com.ashok.dev.Messenger_JAX_RS.Utils.ConnectionHelper;

public class MessagesDAO {

	public ArrayList<Message> getMessages(String userName) throws SQLException{
		ArrayList<Message> messages=new ArrayList<Message>();
		Connection connection=null;
		Statement statement=null;
		ResultSet resultSet=null;
		try{
		 connection=new ConnectionHelper().getConnection();
		 statement=connection.createStatement();
		 resultSet=statement.executeQuery("select * from messages where message_from='"+userName+"' or message_to='"+userName+"';");
		while(resultSet.next()){
			Message message=new Message(resultSet.getInt("message_id"),resultSet.getString("message_from"),resultSet.getString("message_to"),resultSet.getString("message"),resultSet.getString("send_time"),resultSet.getInt("recipt_read"));
			messages.add(message);
		}
		resultSet.close();
		statement.close();
		connection.close();
		}catch(Exception sqlException){
			resultSet.close();
			statement.close();
			connection.close();
		}
		return messages;
		
	}
	
	public ArrayList<Message> getRecentMessages(String userName) throws SQLException{
		ArrayList<Message> messages=new ArrayList<Message>();
		Connection connection=null;
		Statement statement=null;
		ResultSet resultSet=null;
		try{
		 connection=new ConnectionHelper().getConnection();
		 statement=connection.createStatement();
		 resultSet=statement.executeQuery("select * from messages where message_from='"+userName+"' or message_to='"+userName+"' order by send_time  limit 5;");
		while(resultSet.next()){
			Message message=new Message(resultSet.getInt("message_id"),resultSet.getString("message_from"),resultSet.getString("message_to"),resultSet.getString("message"),resultSet.getString("send_time"),resultSet.getInt("recipt_read"));
			messages.add(message);
		}
		resultSet.close();
		statement.close();
		connection.close();
		}catch(Exception sqlException){
			resultSet.close();
			statement.close();
			connection.close();
		}
		return messages;
	}
	
	public ArrayList<Message> getSentMessages(String userName,int limit) throws SQLException{
		ArrayList<Message> messages=new ArrayList<Message>();
		Connection connection=null;
		Statement statement=null;
		ResultSet resultSet=null;
		String  getQuery="select * from messages where message_from='"+userName+"' group by(message_to) order by send_time ";
		try{
		 if(limit!=0)
			 getQuery=getQuery+"limit "+limit;
		 connection=new ConnectionHelper().getConnection();
		 statement=connection.createStatement();
		 resultSet=statement.executeQuery(getQuery);
		while(resultSet.next()){
			Message message=new Message(resultSet.getInt("message_id"),resultSet.getString("message_from"),resultSet.getString("message_to"),resultSet.getString("message"),resultSet.getString("send_time"),resultSet.getInt("recipt_read"));
			messages.add(message);
		}
		resultSet.close();
		statement.close();
		connection.close();
		}catch(Exception sqlException){
			resultSet.close();
			statement.close();
			connection.close();
		}
		return messages;
	}
	
	public ArrayList<Message> getRecivedMessages(String userName,int limit) throws SQLException{
		ArrayList<Message> messages=new ArrayList<Message>();
		Connection connection=null;
		Statement statement=null;
		ResultSet resultSet=null;
		String  getQuery="select * from messages where message_to='"+userName+"' group by(message_from) order by send_time ";
		try{
		 if(limit!=0)
			 getQuery=getQuery+"limit "+limit;
		 System.out.println(getQuery);
		 connection=new ConnectionHelper().getConnection();
		 statement=connection.createStatement();
		 resultSet=statement.executeQuery(getQuery);
		while(resultSet.next()){
			Message message=new Message(resultSet.getInt("message_id"),resultSet.getString("message_from"),resultSet.getString("message_to"),resultSet.getString("message"),resultSet.getString("send_time"),resultSet.getInt("recipt_read"));
			messages.add(message);
		}
		resultSet.close();
		statement.close();
		connection.close();
		}catch(Exception sqlException){
			resultSet.close();
			statement.close();
			connection.close();
		}
		return messages;
	}
}
