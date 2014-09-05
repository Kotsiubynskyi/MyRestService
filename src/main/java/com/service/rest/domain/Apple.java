package com.service.rest.domain;

import javax.ws.rs.DefaultValue;
import javax.ws.rs.FormParam;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "apple")
public class Apple {

    @XmlAttribute
    @DefaultValue("red")
    @FormParam("color")
    private String color;

    @DefaultValue("tasty")
    @FormParam("taste")
    protected String taste;

    @DefaultValue("0")
    @FormParam("weight")
    private Integer weight;

    public Apple() {
    }

    public Apple(String color, Integer weight, String taste) {
        this.color = color;
        this.weight = weight;
        this.taste = taste;
    }

    public String getTaste() {
        return taste;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Apple{" +
                "taste='" + taste + '\'' +
                ", color='" + color + '\'' +
                ", weight=" + weight +
                '}';
    }
}
