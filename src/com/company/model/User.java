package com.company.model;

/**
 * Created by garkaviy on 01.12.2016.
 */
public class User {
    protected String name;
    protected String phone;
    protected String email;

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    protected String position;

    public User( String position) {
        this.position = position;
        System.out.println("User consrtuctor");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
