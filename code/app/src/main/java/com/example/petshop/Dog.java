package com.example.petshop;

import java.util.Date;

public class Dog extends Pet implements Petable {
    public Dog(String name){
        super(name);
    }
    public Dog(String name, Date birthDay){
        super(name,birthDay);
    }

    @Override
    public String speak() {
        return "bark";
    }

    @Override
    public void pet() {

    }
}
