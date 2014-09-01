package com.service;

import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 * @author Animator404 on 21.08.2014.
 */

@WebService
public class SimpleWebService {

    @WebMethod
    public String getString() {
        return "Eugene";
    }
}
