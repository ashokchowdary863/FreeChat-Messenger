package com.ashok.dev.Messenger_JAX_RS.bo;

import java.sql.SQLException;
import java.util.ArrayList;

import com.ashok.dev.Messenger_JAX_RS.Models.User;
import com.ashok.dev.Messenger_JAX_RS.dao.MessagesDAO;
import com.ashok.dev.Messenger_JAX_RS.dao.UsersDAO;
import com.google.gson.Gson;

public class MessagesBO {

	
	public String getMessages(String userName) throws SQLException{
		Gson gson=new Gson();
		String messagesString=gson.toJson(new MessagesDAO().getMessages(userName));
		return messagesString;
	}
	
	public String getRecentMessages(String userName) throws SQLException{
		Gson gson=new Gson();
		String messagesString=gson.toJson(new MessagesDAO().getRecentMessages(userName));
		return messagesString;
	}
}
