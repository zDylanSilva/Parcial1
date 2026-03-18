package com.example;

import com.example.strategy.EmotionalState;
import com.example.strategy.GlobalPopularity;
import com.example.strategy.Record;
import com.example.strategy.TimeAvailability;
import com.example.users.User;

public class Main {
    public static void main(String[] args) {
        EmotionalState algorithm1 = new EmotionalState();
        GlobalPopularity algorithm2 = new GlobalPopularity();
        Record algorithm3 = new Record();
        TimeAvailability algorithm4 = new TimeAvailability();

        User user1 = new User("TestSubject", "1");
        User user2 = new User("AnotherSubject", "2");
        User user3 = new User("FinalSubject", "3");

        user1.setAlgorithm(algorithm4);
        user2.setAlgorithm(algorithm2);
        user3.setAlgorithm(algorithm1);

        //Console check
        user1.getAlgorithm();
        user2.getAlgorithm();
        user3.getAlgorithm();

        //Changing their recommendations
        System.out.println();
        System.out.println("New set of algorithms");
        user1.setAlgorithm(algorithm1);
        user2.setAlgorithm(algorithm3);
        user3.setAlgorithm(algorithm4);

        //Recommendation check
        user1.getAlgorithm();
        user2.getAlgorithm();
        user3.getAlgorithm();


    }
}