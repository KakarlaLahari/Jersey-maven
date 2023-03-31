package com.rest.JerseyMavenImplementation;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Root resource (exposed at "myresource" path)
 */
@Path("myresource")
public class MyResource {

    /**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "text/plain" media type.
     *
     * @return String that will be returned as a text/plain response.
     */
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getIt() {
        return "Maven implementation is working!";
    }
    @Path("hello")
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
    	return " Maven is a build tool " ;
    	
    }
    @Path("hello")
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String working() {
    	return " Maven holds the respository " ;
    	
    }
    @Path("welcome")
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hi() {
    	return " So let’s take a moment ........Just believe in yourself..... Even if you don’t, pretend that you do and, at some point, you will." ;
    }
}
