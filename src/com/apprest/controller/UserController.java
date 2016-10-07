package com.apprest.controller;

import java.util.LinkedList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;

import com.apprest.entities.User;
import com.apprest.service.UserService;

@Path("/users")
public class UserController {

	UserService userService = new UserService();	
	
    @GET
    @Produces({ MediaType.APPLICATION_JSON })
    public List<User> getData() {
        List<User> result = new LinkedList<>();        
//        result.add(new User("Sergio", "Castellote"));
//        result.add(new User("Pere", "Martinez"));
        
        userService.getListUsers();
        
        return result;
    }

    @GET
    @Produces({ MediaType.APPLICATION_JSON })
    @Path("{id}")
    public String getData(@PathParam("id") String id) {
        if ("1".equals(id)) {
            return ("one");
        }
        if ("2".equals(id)) {
            return ("two");
        }
        throw new WebApplicationException(404);
    }



}
