package com.service.rest.service;

import com.service.rest.domain.Apple;
import com.service.rest.exceptions.NoSpaceInStorageException;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

public class WareHouseServiceImpl implements WareHouseService {

    private static final int STORAGE_MAX_CAPACITY = 5;
    public static final String WAREHOUSE_API_APPLE = "/warehouse-api/apple/";
    public static final String THERE_IS_NO_APPLE_WITH_SUCH_ID = "There is no apple with such id";

    @Override
    public List<Apple> getAllApples() {
        return apples;
    }

    @Override
    public Apple getAppleById(int id) {
        return apples.get(id);
    }

    @Override
    public String getCapacity() {
        return String.valueOf(apples.size());
    }

    @Override
    public Response putApple(Apple apple, UriInfo uriInfo) throws URISyntaxException {
        if (apples.size() == STORAGE_MAX_CAPACITY) {
            throw new NoSpaceInStorageException();
        }
        apples.add(apple);
        URI addedAppleUri = new URI(WAREHOUSE_API_APPLE + String.valueOf(apples.size() - 1));
        return Response.created(addedAppleUri).build();
    }

    @Override
    public Response clearStorage() {
        apples.clear();
        return Response.ok().build();
    }

    @Override
    public Response deleteAppleById(Integer appleId) {
        try {
            apples.remove(appleId.intValue());
        } catch (IndexOutOfBoundsException e) {
            return Response.status(Response.Status.BAD_REQUEST).entity(THERE_IS_NO_APPLE_WITH_SUCH_ID).build();
        }
        return Response.ok().build();
    }

    public List<Apple> apples = new ArrayList<Apple>();

}