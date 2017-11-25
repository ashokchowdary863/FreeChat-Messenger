package com.ashok.dev.Messenger_JAX_RS.Models;

import java.security.Timestamp;
import java.sql.Date;

public class Message {
	public int messageId;
	public String messageFrom;
	public String messageTo;
	public String message;
	public String  sendTime;
	public int messageReadStatus;
	
	public Message(int messageId,String messageFrom,String messageTo,String message,String sendTime,int messageReadStatus){
		this.messageId=messageId;
		this.messageFrom=messageFrom;
		this.messageTo=messageTo;
		this.messageReadStatus=messageReadStatus;
		this.sendTime=sendTime;
		this.message=message;
	}
	
	public int getMessageId() {
		return messageId;
	}
	public void setMessageId(int messageId) {
		this.messageId = messageId;
	}
	public String getMessageFrom() {
		return messageFrom;
	}
	public void setMessageFrom(String messageFrom) {
		this.messageFrom = messageFrom;
	}
	public String getMessageTo() {
		return messageTo;
	}
	public void setMessageTo(String messageTo) {
		this.messageTo = messageTo;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getSendTime() {
		return sendTime;
	}
	public void setSendTime(String sendTime) {
		this.sendTime = sendTime;
	}
	public int getMessageReadStatus() {
		return messageReadStatus;
	}
	public void setMessageReadStatus(int messageReadStatus) {
		this.messageReadStatus = messageReadStatus;
	}

}
