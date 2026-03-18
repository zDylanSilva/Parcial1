package com.example.strategy;

public class Record implements Algorithm{

    @Override
    public void algorithmPreference() {
        System.out.println("Your recommendations are now based on your Record");
    }

}
