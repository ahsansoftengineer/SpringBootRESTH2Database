package com.jersey.restapi;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("myresource")
public class MyResource {
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getIt(){
        return "Got it!";
    }
}
