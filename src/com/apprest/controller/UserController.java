package com.apprest.controller;

import java.util.LinkedList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;

import com.apprest.entities.User;
import com.apprest.service.UserService;

import jaxb.MyJaxBean;

@Path("/users")
public class UserController {

	UserService userService = new UserService();	
	
    @GET
    @Produces({ MediaType.APPLICATION_JSON })
    public List<User> getData() {
        List<User> result = new LinkedList<>();                
        result = userService.getListUsers();        
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
    
    @POST
    @Consumes("application/json")
    @Path("/save")
    public User saveUser(final MyJaxBean input){
    	User user = new User(input.name, input.surname);
    	userService.saveUser(user);
    	
		return user;
    	
    }



}
