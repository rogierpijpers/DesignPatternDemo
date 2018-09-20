package com.company.mvc;

public class Main {

    public static void main(String[] args) {
        // MVC Demo

        Hotel hotel = new Hotel("Molveno Lake Resort", "China");
        HotelView view = new HotelView();
        HotelController controller = new HotelController(hotel, view);

        controller.updateView();
    }
}
