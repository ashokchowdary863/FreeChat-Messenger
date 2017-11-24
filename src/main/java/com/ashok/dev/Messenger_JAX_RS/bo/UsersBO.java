package com.ashok.dev.Messenger_JAX_RS.bo;

import java.sql.SQLException;
import java.util.ArrayList;

import com.ashok.dev.Messenger_JAX_RS.Models.User;
import com.ashok.dev.Messenger_JAX_RS.dao.UsersDAO;
import com.google.gson.Gson;

public class UsersBO {
	public String getUsers() throws ClassNotFoundException, SQLException{
		 Gson gson = new Gson();
		 String usersJsonString = gson.toJson(new UsersDAO().getUsers());
		return usersJsonString;
	}
	
	public String getUserInformation(String userName) throws SQLException{
		Gson gson=new Gson();
		String userInformationString=gson.toJson(new UsersDAO().getUserInformation(userName));
		return userInformationString;
	}
	
	public String getRecentActiveUsers() throws SQLException{
		Gson gson=new Gson();
		String usersJsonString=gson.toJson(new UsersDAO().getRecentActiveUsers());
		return usersJsonString;
	}
}
