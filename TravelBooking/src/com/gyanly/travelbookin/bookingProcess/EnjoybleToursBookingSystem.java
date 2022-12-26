package com.gyanly.travelbookin.bookingProcess;

import com.gyanly.travelbookin.domain.TravelTicket;

public class EnjoybleToursBookingSystem implements BookingSystem{


    @Override
    public void setTravelTicket(TravelTicket ticket) {
        System.out.println("Enjoyable Tours has recived ticket" + ticket);
    }

    @Override
    public void requestBooking() {
        System.out.println("Enjoyable Tours has recived a booking request");

    }

    @Override
    public boolean getStatus() {
        System.out.println("Enjoyable Tours is providing the booking status");
        return false;
    }

    @Override
    public boolean cancel() {
        return false;
    }


}
