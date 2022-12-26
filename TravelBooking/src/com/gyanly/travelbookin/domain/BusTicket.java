package com.gyanly.travelbookin.domain;

import com.gyanly.travelbookin.exceptions.InvalidTravelDuarationException;

import java.math.BigDecimal;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;

public class BusTicket extends TravelTicket implements Comparable <TravelTicket>{

    private ArrayList<String> permittedProvides;

    public BusTicket(){
        super();
    }

    public BusTicket(Long bookingRef, String origin, String destination, BigDecimal price, LocalDateTime departureTime, LocalDateTime arrivalTime, ArrayList<String> permittedProvides) throws InvalidTravelDuarationException {
        super(bookingRef, origin, destination, price, departureTime, arrivalTime);
        this.permittedProvides = permittedProvides;
    }

    public BusTicket(TravelTicket t,ArrayList<String> permittedProvides) throws InvalidTravelDuarationException {
        super(t.getBookingRef(),t.getOrigin(),t.getDestination(),t.getPrice(),t.getDepartureTime(),t.getArrivalTime());
        this.permittedProvides = permittedProvides;
    }

    public ArrayList<String> getPermittedProvides() {
        return permittedProvides;
    }

    public void setPermittedProvides(ArrayList<String> permittedProvides) {
        this.permittedProvides = permittedProvides;
    }

    @Override
    public void cancel() {
        Duration d = Duration.between(LocalDateTime.now(),getDepartureTime());
        Long days = d.toDays();
        if(days > 30){
            super.cancel();
        }else {
            System.out.println("Sorry You cannot cancel within 30 days");
        }
    }

    @Override
    public String toString() {
        return "BusTicket{" +
                "permittedProvides=" + permittedProvides +
                "} " + super.toString();
    }
}
