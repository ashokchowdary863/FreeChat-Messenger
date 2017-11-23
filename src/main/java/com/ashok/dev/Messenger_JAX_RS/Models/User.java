package com.ashok.dev.Messenger_JAX_RS.Models;

import java.util.Date;

public class User {
	public int userId;
	public String userName;
	public String firstName;
	public String lastName;
	public Date lastLoginDate;
	
	public User(int userId,String userName,String firstName,String lastName,Date lastLoginDate){
		this.userId=userId;
		this.userName=userName;
		this.firstName=firstName;
		this.lastName=lastName;
		this.lastLoginDate=lastLoginDate;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}
