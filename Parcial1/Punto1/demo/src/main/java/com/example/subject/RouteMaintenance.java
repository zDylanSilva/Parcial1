package com.example.subject;

import java.util.ArrayList;
import java.util.List;

import com.example.observer.Observer;

public class RouteMaintenance implements Subject {

    private String newRoute;
     List<Observer> observers = new ArrayList<>();

     //Cambios en la ruta por mantenimiento
    public RouteMaintenance(){


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

    public void setNewRoute(String newRoute) {
        this.newRoute = newRoute;
        notifyObservers();
    }

        public String getNewRoute() {
        return newRoute;
    }

    @Override
    public String toString(){
        return("Accident ocurred!! new route: " + newRoute);

    }

}
