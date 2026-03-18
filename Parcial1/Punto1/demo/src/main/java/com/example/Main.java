package com.example;

import com.example.observer.User;
import com.example.subject.NewVehicles;
import com.example.subject.RouteMaintenance;
import com.example.subject.ServiceReports;

/*
    This programm is a test for the observer pattern made for the practical exam
    
    @Author DYLAN DAVID SILVA ORREGO
*/
public class Main {
    public static void main(String[] args) {
        
        ServiceReports report1 = new ServiceReports();
        RouteMaintenance maintenance1 = new RouteMaintenance();
        NewVehicles vehicles1 = new NewVehicles();

        User Carolina = new User("Carolina", "1", "Coordinadora");
        User Samuel = new User("Samuel", "2", "Comunicaciones");
        User Roberto = new User("Roberto", "3", "Supervisor");

        report1.addObserver(Carolina);
        maintenance1.addObserver(Samuel);
        maintenance1.addObserver(Roberto);
        vehicles1.addObserver(Samuel);

        //Add test
        report1.setObservations("Choque de buses");
        maintenance1.setNewRoute("Septima parque nacional");
        vehicles1.setVehicle("Buseta volvo informal");



    }
}