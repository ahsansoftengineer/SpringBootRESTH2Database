package com.jersey.restapi;

import javax.print.attribute.standard.Media;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.awt.*;

@Path("aliens")
public class AlienResource {
    @GET
    @Produces(MediaType.APPLICATION_XML)
    public Alien getAlien(){
        System.out.println("Get Alien Called");
        Alien a1 = new Alien();
        a1.setName("Ahsan");
        a1.setPoints(78);
        return a1;
    }
}
