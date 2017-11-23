package com.ashok.dev.Messenger_JAX_RS.Resources;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import com.ashok.dev.Messenger_JAX_RS.*;
/**
 * Root resource (exposed at "myresource" path)
 */
@Path("TestAPI")
public class TestResource {

    /**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "text/plain" media type.
     *
     * @return String that will be returned as a text/plain response.
     */
	@Path("sayHello")
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String sayHello() {
        return "Hi there...Nice to see you...!";
    }
	
	@Path("sayBye")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String sayBye() {
		ObjectMapper mapper = new ObjectMapper();
		String jsonInString = null;
		
		try {
			jsonInString = mapper.writeValueAsString("Ashok Kumar Karasala");
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        return jsonInString;
    }
}
