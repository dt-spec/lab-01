package com.example.petshop;

import java.util.Date;

public class HappyMood extends Mood {

    // Constructor 1: default date
    public HappyMood() {
        super(); // calls Mood()
    }

    // Constructor 2: date provided
    public HappyMood(Date date) {
        super(date); // calls Mood(Date)
    }

    @Override
    public String getMoodString() {
        return "Happy";
    }
}
