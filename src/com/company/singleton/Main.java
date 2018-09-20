package com.company.singleton;

public class Main {

    public static void main(String[] args) {
        Singleton single1 = Singleton.getInstance();
        Singleton single2 = Singleton.getInstance();

        System.out.println(single1.equals(single2));
    }
}
