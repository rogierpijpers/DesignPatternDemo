package com.company;

public class HotelController {
    /*
     * This is the CONTROLLER component of the Hotel.
     * It uses the MODEL to facilitate data to the VIEW.
     */

    private Hotel hotel;
    private HotelView hotelView;

    public HotelController(Hotel hotel, HotelView hotelView) {
        this.hotel = hotel;
        this.hotelView = hotelView;
    }

    public void setHotelName() {

    }

    public String getHotelName() {

        return hotel.getName();
    }

    public void setHotelLocation() {

    }

    public String getHotelLocation() {
        return hotel.getLocation();
    }

    public void updateView() {
        hotelView.printHotelNameAndLocation(hotel.getName(), hotel.getLocation());
    }
}
