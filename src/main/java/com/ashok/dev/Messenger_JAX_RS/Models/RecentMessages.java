package com.ashok.dev.Messenger_JAX_RS.Models;

import java.util.ArrayList;

public class RecentMessages {
	public ArrayList<Message> recentMessages;
	public ArrayList<Message> sentMessages;
	public ArrayList<Message> recievedMessages;
	
	public RecentMessages(ArrayList<Message> recentMessages,ArrayList<Message> sentMessages,ArrayList<Message> recievedMessaages){
		this.recentMessages=recentMessages;
		this.sentMessages=sentMessages;
		this.recievedMessages=recievedMessaages;
	}
	
	public ArrayList<Message> getRecentMessages() {
		return recentMessages;
	}
	public void setRecentMessages(ArrayList<Message> recentMessages) {
		this.recentMessages = recentMessages;
	}
	public ArrayList<Message> getSentMessages() {
		return sentMessages;
	}
	public void setSentMessages(ArrayList<Message> sentMessages) {
		this.sentMessages = sentMessages;
	}
	public ArrayList<Message> getRecievedMessages() {
		return recievedMessages;
	}
	public void setRecievedMessages(ArrayList<Message> recievedMessages) {
		this.recievedMessages = recievedMessages;
	}
	
	
	
}
