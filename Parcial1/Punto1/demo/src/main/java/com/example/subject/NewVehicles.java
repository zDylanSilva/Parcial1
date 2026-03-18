package com.example.subject;

import java.util.ArrayList;
import java.util.List;

import com.example.observer.Observer;

public class NewVehicles implements Subject {

    private String incomingVehicle;
    List<Observer> observers = new ArrayList<>();

    //Llegada de nuevos vehiculos
    public NewVehicles(){


    }
    public void setVehicle(String newVehicle) {
        this.incomingVehicle = newVehicle;
        notifyObservers();
    }

    @Override
    public void addObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }


    @Override
    public void notifyObservers() {
     for(Observer observer : observers)
            observer.update(this.toString());
    }

    public String getVehicle() {
        return incomingVehicle;
    }

    @Override
    public String toString(){
        return("Electric vehicles coming today: " + incomingVehicle);

    }

}
