package com.springboot.telesko.mvc.pojo;

import org.springframework.stereotype.Component;

@Component("loptop")
public class Laptop {
    private int id;
    private String name;
    private String configuration;

    public Laptop() {
    }

    public Laptop(int id, String name, String configuration) {
        this.id = id;
        this.name = name;
        this.configuration = configuration;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getConfiguration() {
        return configuration;
    }

    public void setConfiguration(String configuration) {
        this.configuration = configuration;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", configuration='" + configuration + '\'' +
                '}';
    }
}
