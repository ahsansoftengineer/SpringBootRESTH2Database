package com.springboot.telesko.mvc.pojo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

// Create Instance of this class in Spring Container
@Component // "Change" name here with Spring Container
@Scope() // value = "prototype" // for changing the default behaviour of Single Ton
public class Alien {
    private int id;
    private String name;
    private String tech;
    @Autowired
    @Qualifier("loptop") // Customizing  the name in the Spring Container
    private Laptop laptop;

    public Alien(){}

    public Alien(int id, String name, String tech) {
        this.id = id;
        this.name = name;
        this.tech = tech;
    }

    public Alien(int id, String name, String tech, Laptop laptop) {
        this.id = id;
        this.name = name;
        this.tech = tech;
        this.laptop = laptop;
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

    public String getTech() {
        return tech;
    }

    public Laptop getLaptop() {
        return laptop;
    }

    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }

    public void setTech(String tech) {
        this.tech = tech;
    }

    @Override
    public String toString() {
        return "Alien{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", tech='" + tech + '\'' +
                ", laptop=" + laptop +
                '}';
    }
}
