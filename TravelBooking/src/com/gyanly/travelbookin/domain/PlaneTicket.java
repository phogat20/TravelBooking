package com.gyanly.travelbookin.domain;

import com.gyanly.travelbookin.exceptions.InvalidTravelDuarationException;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class PlaneTicket extends TravelTicket implements Comparable <TravelTicket>{
    private TravelClass travelClass;
    private Integer seatNumber;
    private Integer stopOvers;

    public PlaneTicket(){
        super();
    }

    public PlaneTicket(Long bookingRef, String origin, String destination, BigDecimal price, LocalDateTime departureTime, LocalDateTime arrivalTime, TravelClass travelClass, Integer seatNumber, Integer stopOvers) throws InvalidTravelDuarationException {
        super(bookingRef, origin, destination, price, departureTime, arrivalTime);
        this.travelClass = travelClass;
        this.seatNumber = seatNumber;
        this.stopOvers = stopOvers;
    }

    public TravelClass getTravelClass() {
        return travelClass;
    }

    public void setTravelClass(TravelClass travelClass) {
        this.travelClass = travelClass;
    }

    public Integer getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(Integer seatNumber) {
        this.seatNumber = seatNumber;
    }

    public Integer getStopOvers() {
        return stopOvers;
    }

    public void setStopOvers(Integer stopOvers) {
        this.stopOvers = stopOvers;
    }

    public void upgrade(){
        System.out.println(" You have been upgraded");
    }

    public void addStopOver(){
        stopOvers++;
        System.out.println("You Have "+ stopOvers + "stopovers");
    }


}
