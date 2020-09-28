package com.company;

import java.sql.SQLOutput;

public class Human extends Animal{
    private String country;
    public Human (String name, int age, String country) {
        super(name, age);
        this.country = country;
    }
    @Override
    public void say() {
        System.out.println("This human is from " + this.country);
    }
}
