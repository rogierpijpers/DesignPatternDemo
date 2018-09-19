package com.company;

public class Hotel {
    /*
    * This represents the MODEL component of the MVC-pattern.
    * Hotel is an object carrying data.
    */

    private String name;
    private String location;

    public Hotel(String name, String location){
        this.name = name;
        this.location = location;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
