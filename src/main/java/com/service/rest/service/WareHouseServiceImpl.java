package com.service.rest.service;

import com.service.rest.domain.Apple;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

public class WareHouseServiceImpl implements WareHouseService {

    private static final int STORAGE_MAX_CAPACITY = 5;
    public static final String WAREHOUSE_API_APPLE = "/warehouse-api/apple/";

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
    public Response putApple(Apple apple,UriInfo uriInfo) throws URISyntaxException {
        if (apples.size() == STORAGE_MAX_CAPACITY) {
            return Response.notModified().build();
        }
        apples.add(apple);
        System.out.println(apple);
        URI addedAppleUri = new URI(WAREHOUSE_API_APPLE + String.valueOf(apples.size() - 1));
        return Response.created(addedAppleUri).build();
    }


    public static List<Apple> apples = new ArrayList<Apple>();

}