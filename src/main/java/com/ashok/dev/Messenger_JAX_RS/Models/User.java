package com.ashok.dev.Messenger_JAX_RS.Models;

import java.security.Timestamp;
import java.sql.Date;

public class User {
	public int userId;
	public String userName;
	public String firstName;
	public String gender;
	public String email;
	public String mobile;
	public String lastName;
	public String lastLoginDate;
	
	
	
	
	public User(int userId,String userName,String firstName,String lastName,String lastLoginDate,String gender,String email,String mobile){
		this.userId=userId;
		this.userName=userName;
		this.firstName=firstName;
		this.lastName=lastName;
		this.lastLoginDate=lastLoginDate;
		this.email=email;
		this.mobile=mobile;
		this.gender=gender;
	}
	
	
	
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getLastLoginDate() {
		return lastLoginDate;
	}
	public void setLastLoginDate(String lastLoginDate) {
		this.lastLoginDate = lastLoginDate;
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
