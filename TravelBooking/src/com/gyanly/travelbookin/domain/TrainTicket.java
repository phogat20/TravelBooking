package com.gyanly.travelbookin.domain;

import com.gyanly.travelbookin.exceptions.InvalidTravelDuarationException;

import java.math.BigDecimal;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Objects;

public class TrainTicket extends TravelTicket implements Comparable <TravelTicket>{

    private TravelClass travelClass;
    private Integer carriageNumber;
    private Integer seatNumber;

    public TrainTicket(){
        super();
    };

    public TrainTicket(Long bookingRef, String origin, String destination, BigDecimal price, LocalDateTime departureTime, LocalDateTime arrivalTime, TravelClass travelClass, Integer carriageNumber, Integer seatNumber) throws InvalidTravelDuarationException {
        super(bookingRef, origin, destination, price, departureTime, arrivalTime);
        this.travelClass = travelClass;
        this.carriageNumber = carriageNumber;
        this.seatNumber = seatNumber;
    }



    public TravelClass getTravelClass() {
        return travelClass;
    }

    public void setTravelClass(TravelClass travelClass) {
        this.travelClass = travelClass;
    }

    public Integer getCarriageNumber() {
        return carriageNumber;
    }

    public void setCarriageNumber(Integer carriageNumber) {
        this.carriageNumber = carriageNumber;
    }

    public Integer getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(Integer seatNumber) {
        this.seatNumber = seatNumber;
    }

    public void upgrade(){
        if(travelClass != TravelClass.FIRST){
            travelClass = TravelClass.FIRST;
            System.out.println("You have been Upgraded");
        }else {
            System.out.println("You are alrady in 1st class");
        }
    }

    @Override
    public String toString() {
        return "TrainTicket{" +
                "travelClass=" + travelClass +
                ", carriageNumber=" + carriageNumber +
                ", seatNumber=" + seatNumber +
                "} " + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TrainTicket that = (TrainTicket) o;
        return Objects.equals(travelClass, that.travelClass) && Objects.equals(carriageNumber, that.carriageNumber) && Objects.equals(seatNumber, that.seatNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(travelClass, carriageNumber, seatNumber);
    }
}
