package com.example.subject;

import java.util.ArrayList;
import java.util.List;

import com.example.observer.Observer;

public class ServiceReports implements Subject {

    private String observations;
    List<Observer> observers = new ArrayList<>();
    //Reporte de congestion o interrupciones de servicio
    public ServiceReports(){

    }
    @Override
    public void addObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
    }

    @Override
    public void notifyObservers() {
        for(Observer observer : observers)
            observer.update(this.toString());
    }

    public void setObservations(String observations) {
        this.observations = observations;
        notifyObservers();
    }

    public String getObservations() {
        return observations;
    }
    @Override
    public String toString(){
        return("New report incoming with observations: " + observations);

    }

}
