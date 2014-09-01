package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Created by Animator404 on 21.08.2014.
 */

@Controller
@RequestMapping(value = "/welcome")
public class SpringController {

    @RequestMapping(method = RequestMethod.GET, produces = "application/json")
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public Apple getAppleJson() {
        return new Apple(12, "Good apple");
    }

    @RequestMapping(method = RequestMethod.GET, produces = "application/xml")
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public Apple getAppleXML() {
        return new Apple(12, "Good apple");
    }

}
