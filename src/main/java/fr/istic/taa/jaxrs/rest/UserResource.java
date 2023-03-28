package fr.istic.taa.jaxrs.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import fr.istic.taa.jaxrs.domain.*;
import io.swagger.v3.oas.annotations.Parameter;

@Path("/user")
@Produces({"application/json"})
public class UserResource {

    @GET
    @Path("/{userId}")
    public User getUserById(@PathParam("userId") Long userId)  {
        // return user
        return new User();
    }

    @POST
    @Consumes("application/json")
    public Response addUser(
            @Parameter(description = "User object that needs to be added to the store", required = true) User user) {
        // add user
        return Response.ok().entity("SUCCESS").build();
    }
}