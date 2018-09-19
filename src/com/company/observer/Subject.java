package com.company.observer;

import java.util.ArrayList;

public class Subject {
    private String newsMessage;

    private ArrayList<Observer> observers;

    Subject(){
        observers = new ArrayList<>();
    }
    public void attach(Observer observer){
        observers.add(observer);
    }

//    public void detach(Observer observer){
//        // Todo: detach logics
//    }

    public void notifyObservers(){

        for (int i = 0; i < observers.size(); i++) {
            observers.get(i).update();
        }
    }

    public void setNewsMessage(String newsMessage){
        this.newsMessage = newsMessage;
        this.notifyObservers();
    }

    public String getNewsMessage(){
        return newsMessage;
    }
}
