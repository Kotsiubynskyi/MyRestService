package com.service.rest.exceptions.mappers;

import com.service.rest.exceptions.NoSpaceInStorageException;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

/**
 * @author EvgeniyKot on 08.09.2014.
 */
@Provider
public class NoSpaceInStorageExceptionMapper implements ExceptionMapper<NoSpaceInStorageException> {

    public static final String NO_SPACE_IN_STORAGE_MESSAGE = "Storage is full. There is no more free space.";
    public static final int HTTP422_UNPROCESSABLE_ENTITY = 422;

    @Override
    public Response toResponse(NoSpaceInStorageException e) {
        return Response.status(HTTP422_UNPROCESSABLE_ENTITY).entity(NO_SPACE_IN_STORAGE_MESSAGE).build();
    }
}
