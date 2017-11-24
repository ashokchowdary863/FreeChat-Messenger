package com.ashok.dev.Messenger_JAX_RS.Resources;

import java.sql.SQLException;
import java.util.ArrayList;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.ashok.dev.Messenger_JAX_RS.bo.UsersBO;
import com.ashok.dev.Messenger_JAX_RS.dao.UsersDAO;

@Path("users")
public class UsersResources {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public String getUsers() throws ClassNotFoundException, SQLException{
		return new UsersBO().getUsers();
	}
	
	
	@GET
	@Path("{userName}")
	@Produces(MediaType.APPLICATION_JSON)
	public String getUserInformation(@PathParam("userName") String userName) throws SQLException{
		return new UsersBO().getUserInformation(userName);
	}
	
	@GET
	@Path("getRecentActiveUsers")
	@Produces(MediaType.APPLICATION_JSON)
	public String getRecentActiveUsers() throws SQLException{
		return new UsersBO().getRecentActiveUsers();
	}
	
}
