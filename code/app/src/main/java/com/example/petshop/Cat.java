package com.example.petshop;

import java.util.Date;

public class Cat extends Pet implements Petable {
    public Cat(String name){
        super(name);
    }
    public Cat(String name, Date birthDay){
        super(name,birthDay);
    }

    @Override
    public String speak() {
        return "meow";
    }

    @Override
    public void pet() {

    }
}
