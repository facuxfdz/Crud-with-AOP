package com.clients.clientsspring.model;


public class Client {
    private Integer id;
    private String name;
    private String lastname;

    public String getLastname() {
        return lastname;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
}
