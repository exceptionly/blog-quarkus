package org.exceptionly.demo;

import org.exceptionly.demo.service.PriceConverter;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


@Path("/price")
public class QuarkusResource {

    @Inject
    PriceConverter priceConverter;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public double price() {
        return priceConverter.price();
    }
}