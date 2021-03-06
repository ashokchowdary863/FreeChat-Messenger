# Important Note 
This project still in development mode.I am implementing all the features that are needed for a chatting website.Fork/follow the repository to get the updates :)


# Messenger_JAX-RS

This project  will give you basic idea of how to write API's using Restful Web Services in Java.

# Softwares/Technologies Used
 * Java 8
 * Eclipse Neon EE
 * Maven
 * Jersey vesion : 2.25.1
 * Apache Tomcat 8.5
 * Front end : HTML,Javascript,jQuery,CSS
 


# About JAX-RS

JAX-RS: Java API for RESTful Web Services (JAX-RS) is a Java programming language API spec that provides support in creating web services according to the Representational State Transfer (REST) architectural pattern.
JAX-RS uses annotations, introduced in Java SE 5, to simplify the development and deployment of web service clients and endpoints.


# Specifications
JAX-RS provides some annotations to aid in mapping a resource class (a POJO) as a web resource. The annotations include:

    @Path specifies the relative path for a resource class or method.
    @GET, @PUT, @POST, @DELETE and @HEAD specify the HTTP request type of a resource.
    @Produces specifies the response Internet media types (used for content negotiation).
    @Consumes specifies the accepted request Internet media types.

In addition, it provides further annotations to method parameters to pull information out of the request. All the @*Param annotations take a key of some form which is used to look up the value required.

    @PathParam binds the method parameter to a path segment.
    @QueryParam binds the method parameter to the value of an HTTP query parameter.
    @MatrixParam binds the method parameter to the value of an HTTP matrix parameter.
    @HeaderParam binds the method parameter to an HTTP header value.
    @CookieParam binds the method parameter to a cookie value.
    @FormParam binds the method parameter to a form value.
    @DefaultValue specifies a default value for the above bindings when the key is not found.
    @Context returns the entire context of the object (for example @Context HttpServletRequest request).

# Screenshots

![alt text](https://github.com/ashokchowdary863/Messenger_JAX-RS/raw/master/Screenshots/Dashboard.png)
