package com.example.petshop;

import java.util.Date;

public abstract class Mood {

    // Encapsulated attribute
    private Date date;

    // Constructor 1: default date (now)
    protected Mood() {
        this.date = new Date();
    }

    // Constructor 2: date provided
    protected Mood(Date date) {
        // Optional null-safety
        this.date = (date != null) ? date : new Date();
    }

    // Getter
    public Date getDate() {
        return date;
    }

    // Setter
    public void setDate(Date date) {
        // Optional null-safety
        this.date = (date != null) ? date : new Date();
    }

    // Each concrete mood must say what it is (e.g., "Happy", "Sad")
    public abstract String getMoodString();
}
