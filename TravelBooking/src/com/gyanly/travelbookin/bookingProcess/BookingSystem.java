package com.gyanly.travelbookin.bookingProcess;

import com.gyanly.travelbookin.domain.TravelTicket;

public interface BookingSystem {

    public void setTravelTicket(TravelTicket ticket);
    public void requestBooking();
    public boolean getStatus();

    public boolean cancel();

    public static String getVersion(){
        return "Version 1.0";
    }

    public static BookingSystem of(TravelTicket ticket){
        BookingSystem bookingSystem = new CheapTravelBookingSystem();
        bookingSystem.setTravelTicket(ticket);
        return bookingSystem;
    }

    public default boolean isExpired(){
        return true;
    }
}
