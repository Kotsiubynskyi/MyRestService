package com.service.rest.domain;

import javax.ws.rs.DefaultValue;
import javax.ws.rs.FormParam;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "apple")
public class Apple {

    @XmlAttribute
    @FormParam("taste")
    @DefaultValue("tasty")
    protected String taste;

    @FormParam("color")
    @DefaultValue("red")
    private String color;


    @FormParam("weight")
    @DefaultValue("100")
    private Integer weight;

    public Apple() {
    }

    public Apple(String color, Integer weight, String taste) {
        this.color = color;
        this.weight = weight;
        this.taste = taste;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public String getTaste() {
        return taste;
    }

    public void setTaste(String taste) {
        this.taste = taste;
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
