package com.ashok.dev.Messenger_JAX_RS.Resources;

import java.sql.SQLException;
import java.util.ArrayList;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.ashok.dev.Messenger_JAX_RS.Models.User;
import com.ashok.dev.Messenger_JAX_RS.bo.UsersBO;

@Path("users")
public class UsersResources {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public String getUsers() throws ClassNotFoundException, SQLException{
		return new UsersBO().getUsers();
	}
}
