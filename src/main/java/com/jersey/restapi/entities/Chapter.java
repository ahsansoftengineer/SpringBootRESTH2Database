package com.jersey.restapi.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Chapter {
    @Id
    private int id;
    private String name;
    @Column(name = "total_page")
    private int totalPage;

    public Chapter() {
        super();
    }

    public Chapter(int id, String name, int totalPage) {
        super();
        this.id = id;
        this.name = name;
        this.totalPage = totalPage;
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

    public int getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(int totalPage) {
        this.totalPage = totalPage;
    }

    @Override
    public String toString() {
        return "Chapter{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", totalPage=" + totalPage +
                '}';
    }
}
