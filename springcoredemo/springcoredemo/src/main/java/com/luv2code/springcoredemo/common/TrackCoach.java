package com.luv2code.springcoredemo.common;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class TrackCoach implements Coach{

    public TrackCoach(){
        System.out.println("the constructor : " + getClass().getSimpleName());
    }

//    post initialization

    @PostConstruct
    public void afterStart(){
        System.out.println("TrackCoach started correctly");
    }


//    before unmount

    @PreDestroy
    public void beforeStart(){
        System.out.println("TrackCoach Shut down correctly");
    }


    @Override
    public String getDailyWorkout() {
        return "Run hard 5 k!";
    }
}
