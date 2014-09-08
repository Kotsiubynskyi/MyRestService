package com.service.rest.service;

import com.service.rest.domain.Apple;

import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;
import java.net.URISyntaxException;
import java.util.List;

@Path("/warehouse-api")
public interface WareHouseService {

    @GET
    @Path("apple")
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public List<Apple> getAllApples();

    @GET
    @Path("apple/{id}")
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public Apple getAppleById(@PathParam("id") int id);

    @GET
    @Path("capacity")
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public String getCapacity();

    @POST
    @Path("putApple")
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public Response putApple(@BeanParam Apple apple, @Context UriInfo uriInfo) throws URISyntaxException;

    @DELETE
    @Path("clearStorage")
    public Response clearStorage();
}