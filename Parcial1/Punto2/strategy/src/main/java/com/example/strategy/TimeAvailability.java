package com.example.strategy;

public class TimeAvailability implements Algorithm {

    @Override
    public void algorithmPreference() {
        System.out.println("Your recommendations are now based on content duration");
    }

}
