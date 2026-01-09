package com.example.petshop;
import android.util.Log;
import java.util.Date;

public class SadMood extends Mood {

    // Constructor 1: default date
    public SadMood() {
        super(); // calls Mood()
    }

    // Constructor 2: date provided
    public SadMood(Date date) {
        super(date); // calls Mood(Date)
    }

    @Override
    public String getMoodString() {
        return "Sad";
    }
}
