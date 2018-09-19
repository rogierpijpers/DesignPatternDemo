package com.hungergames;

public class Singleton {

    private static Singelton firstInstance = null;

    private Singleton() {}

    public static Singleton getInstance() {

        if(firstInstance == null){
            firstInstance = new Singleton()
        }
        return firstInstance;
    }
}
