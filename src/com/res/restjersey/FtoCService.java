package com.res.restjersey;

import java.util.LinkedList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;

@Path("/ftocservice")
public class FtoCService {

    @GET
    @Produces({ MediaType.APPLICATION_JSON })
    public List<Usuarios> getData() {
        List<Usuarios> result = new LinkedList<>();
        result.add(new Usuarios("Sergio", "Castellote"));
        result.add(new Usuarios("Pere", "Martinez"));
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
    // @GET
    // @Produces({ MediaType.APPLICATION_JSON })
    // public List<Data> getData() {
    // List<Data> result = new LinkedList<>();
    // result.add(new Data(1, "one"));
    // result.add(new Data(2, "two"));
    // return result;
    // }

    // @GET
    // @Produces({ MediaType.APPLICATION_JSON })
    // @Path("{id}")
    // public Data getData(@PathParam("id") String id) {
    // if ("1".equals(id)) {
    // return new Data(1, "one");
    // }
    // if ("2".equals(id)) {
    // return new Data(2, "two");
    // }
    // throw new WebApplicationException(404);
    // }
}
