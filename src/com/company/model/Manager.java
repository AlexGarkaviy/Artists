package com.company.model;

/**
 * Created by garkaviy on 29.11.2016.
 */
public class Manager extends User {
    public Manager() {
        super("manager");
        System.out.println( "Manager constructor");
    }

    public String toString() {

        return "Manager: " + name + ", " + phone + ", " + email;
    }
}