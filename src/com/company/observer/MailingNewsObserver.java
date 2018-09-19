package com.company.observer;

public class MailingNewsObserver extends Observer{



    public MailingNewsObserver(Subject subject){
      this.newsSubject = subject;

      this.newsSubject.attach(this);
    }

    @Override
    public void update() {
        System.out.println( "You have a new company email");
        System.out.println( newsSubject.getNewsMessage());
    }
}