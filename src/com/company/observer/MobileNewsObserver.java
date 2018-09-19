package com.company.observer;

public class MobileNewsObserver extends Observer {
    public MobileNewsObserver(Subject subject){
        this.newsSubject = subject;
        this.newsSubject.attach(this);
    }

    @Override
    public void update() {
        System.out.println( "You have a new company SMS message : ");
        System.out.println( newsSubject.getNewsMessage());
    }
}
