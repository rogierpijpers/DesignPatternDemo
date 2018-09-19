package com.company.observer;

public class ObserverDemo {

    public static void main(String[] args) {
	// write your code here

        Subject subject = new Subject();

        // Voeg 2x een observer toe aan ons Subject (via de parameter subject)
        new MailingNewsObserver(subject);
        new MobileNewsObserver(subject);


        System.out.println("Voeg een nieuw nieuwsbericht toe aan het subject");
        subject.setNewsMessage("Je hebt nu het Observer pattern geleerd!");

        System.out.println("Voeg een tweede nieuwsbericht toe aan het subject");
        subject.setNewsMessage("Iedereen mag nu een kop koffie halen!");

    }
}
