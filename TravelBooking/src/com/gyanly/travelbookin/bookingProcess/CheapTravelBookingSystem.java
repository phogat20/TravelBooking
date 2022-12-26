package com.gyanly.travelbookin.bookingProcess;

import com.gyanly.travelbookin.domain.TravelTicket;

public class CheapTravelBookingSystem implements BookingSystem{


    @Override
    public void setTravelTicket(TravelTicket ticket) {
        System.out.println("Cheap Travel has recived ticket" + ticket);
    }

    @Override
    public void requestBooking() {
        System.out.println("Cheap Travel has recived a booking request");
    }

    @Override
    public boolean getStatus() {
        System.out.println("Cheap Travel is providing the booking status");
        return false;
    }

    @Override
    public boolean cancel() {
        return false;
    }
}
