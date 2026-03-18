package com.example.subject;

import com.example.observer.Observer;

public interface Subject {  

    public void addObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObservers();

}
