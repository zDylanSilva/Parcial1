package com.example.observer;

public class User implements Observer {
    
    public String name;
    public String id;
    public String role;

    public User(String name, String id, String role){
        this.id=id;
        this.name = name;
        this.role = role;
    }
    @Override
    public void update(String event) {
        System.out.println("Hey "+ name + " there's a new update: \n" + event);
    }
    

}
