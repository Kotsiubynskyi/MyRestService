package com.service.rest;

import com.service.rest.exceptions.mappers.NoSpaceInStorageExceptionMapper;
import com.service.rest.service.WareHouseServiceImpl;

import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;

/**
 * @author EvgeniyKot on 08.09.2014.
 */
public class RestApplication extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> classSet = new HashSet<Class<?>>();
        classSet.add(NoSpaceInStorageExceptionMapper.class);
        return classSet;
    }

    @Override
    public Set<Object> getSingletons() {
        Set<Object> services = new HashSet<Object>();
        services.add(new WareHouseServiceImpl());
        return services;
    }
}
