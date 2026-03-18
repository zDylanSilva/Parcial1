package com.example.users;

import com.example.strategy.Algorithm;

public class User {
     
    public String name;
    public String id;
    private Algorithm algorithm;


    public User(String name, String id){
        this.id=id;
        this.name = name;

    }

    public String getAlgorithm() {
        return ("You are using the " + algorithm + " algorithm");
    }

    public void setAlgorithm(Algorithm algorithm) {

        System.out.println("Changing " + name +" algorithm... ");
        this.algorithm = algorithm;
        this.algorithm.algorithmPreference();

    }

    

}
