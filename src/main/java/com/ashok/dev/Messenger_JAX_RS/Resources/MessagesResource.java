package com.ashok.dev.Messenger_JAX_RS.Resources;

import java.sql.SQLException;
import java.util.ArrayList;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.ashok.dev.Messenger_JAX_RS.Models.RecentMessages;
import com.ashok.dev.Messenger_JAX_RS.bo.MessagesBO;
import com.ashok.dev.Messenger_JAX_RS.bo.UsersBO;
import com.ashok.dev.Messenger_JAX_RS.dao.UsersDAO;

@Path("messages")
public class MessagesResource {
	
	@GET
	@Path("{userName}")
	@Produces(MediaType.APPLICATION_JSON)
	public String getUserInformation(@PathParam("userName") String userName) throws SQLException{
		return new MessagesBO().getMessages(userName);
	}
	
	@GET
	@Path("getRecentMessages/{userName}")
	@Produces(MediaType.APPLICATION_JSON)
	public String getRecentMessages(@PathParam("userName") String userName) throws SQLException{
		return new MessagesBO().getRecentMessages(userName);
	}
	
	@GET
	@Path("sendMessage")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public String sendMessage(){
		return  "";
	}
	
}
