package com.jersey.restapi;

import javax.xml.bind.annotation.XmlRootElement;

// POJO (Plain Old Java Object)
@XmlRootElement
public class Alien {
    private String name;
    private int points;

    public Alien() {
    }
    public Alien(String name, int points) {
        this.name = name;
        this.points = points;
    }
    public int getPoints() {
        return points;
    }
    public void setPoints(int points) {
        this.points = points;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
