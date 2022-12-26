package com.gyanly.travelbookin.domain;
import com.gyanly.travelbookin.exceptions.InvalidTravelDuarationException;

import java.math.BigDecimal;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Objects;

public abstract class TravelTicket implements Comparable <TravelTicket>{
    private Long bookingRef;
    private String origin;
    private String destination;
    private BigDecimal price;
    private LocalDateTime departureTime;
    private LocalDateTime arrivalTime;

    public TravelTicket(){};

    public TravelTicket(Long bookingRef, String origin, String destination, BigDecimal price, LocalDateTime departureTime, LocalDateTime arrivalTime) throws InvalidTravelDuarationException {
       if (Duration.between(departureTime,arrivalTime).toSeconds() < 0){
           throw new InvalidTravelDuarationException("You canot arrive before you departed !");
       }

        this.bookingRef = bookingRef;
        this.origin = origin;
        this.destination = destination;
        this.price = price;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
    }



    public Long getBookingRef() {
        return bookingRef;
    }

    public void setBookingRef(Long bookingRef) {
        this.bookingRef = bookingRef;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public LocalDateTime getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(LocalDateTime departureTime) {
        this.departureTime = departureTime;
    }

    public LocalDateTime getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(LocalDateTime arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public void reschedule(){
        System.out.println("I am Rescheduling your Ticket");
    }

    public void cancel(){
        System.out.println("I am Canceling the ticket");
    }

    @Override
    public int compareTo(TravelTicket o) {
        return bookingRef.compareTo(o.getBookingRef());
    }

    @Override
    public String toString() {
        return "TravelTicket{" +
                "bookingRef=" + bookingRef +
                ", origin='" + origin + '\'' +
                ", destination='" + destination + '\'' +
                ", price=" + price +
                ", departureTime=" + departureTime +
                ", arrivalTime=" + arrivalTime +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TravelTicket that = (TravelTicket) o;
        return Objects.equals(bookingRef, that.bookingRef) && Objects.equals(origin, that.origin) && Objects.equals(destination, that.destination) && Objects.equals(price, that.price) && Objects.equals(departureTime, that.departureTime) && Objects.equals(arrivalTime, that.arrivalTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookingRef, origin, destination, price, departureTime, arrivalTime);
    }
}
