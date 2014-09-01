package com.service;

import org.springframework.stereotype.Component;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by Animator404 on 21.08.2014.
 */

@XmlRootElement(name = "apple")
@Component
public class Apple {

    private Integer size;
    private String name;

    public Apple() {
    }

    public Apple(Integer size, String name) {
        this.size = size;
        this.name = name;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
