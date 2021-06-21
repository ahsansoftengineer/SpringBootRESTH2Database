package com.jersey.restapi;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("aliens")
public class AlienResource {
    @GET
    @Produces(MediaType.APPLICATION_XML)
    public Alien getAlien(){
        System.out.println("Get Alien Called");
        Alien a1 = new Alien();
        a1.setName("John");
        a1.setPoints(78);
        return a1;
    }
}
