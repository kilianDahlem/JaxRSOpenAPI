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

@Path("/membre")
@Produces({"application/json"})
public class MembreResource {

    @GET
    @Path("/{membreId}")
    public Membre getMembreById(@PathParam("membreId") Long membreId)  {
        // return membre
        return new Membre();
    }

    @POST
    @Consumes("application/json")
    public Response addMembre(
            @Parameter(description = "Membre object that needs to be added to the store", required = true) User user) {
        // add membre
        return Response.ok().entity("SUCCESS").build();
    }
}