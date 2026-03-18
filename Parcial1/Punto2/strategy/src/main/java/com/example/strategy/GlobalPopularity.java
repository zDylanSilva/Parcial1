package com.example.strategy;

public class GlobalPopularity implements Algorithm{

    @Override
    public void algorithmPreference() {
        System.out.println("Your recommendations are now based on Global Popularity");
    }

}
