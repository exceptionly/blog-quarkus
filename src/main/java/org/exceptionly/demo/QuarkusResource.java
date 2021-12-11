package org.exceptionly.demo;

import org.exceptionly.demo.service.QuarkusService;
import org.jboss.resteasy.annotations.jaxrs.PathParam;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


@Path("/ping")
public class QuarkusResource {

    @Inject
    QuarkusService service;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/{name}")
    public String ping(@PathParam String name) {
        return service.greeting(name);
    }
}