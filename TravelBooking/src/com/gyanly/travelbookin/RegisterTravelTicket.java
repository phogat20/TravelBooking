package com.gyanly.travelbookin;

import com.gyanly.travelbookin.domain.BusTicket;
import com.gyanly.travelbookin.domain.TrainTicket;
import com.gyanly.travelbookin.domain.TravelClass;
import com.gyanly.travelbookin.exceptions.InvalidTravelDuarationException;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Scanner;

public class RegisterTravelTicket {
    public static void main(String[] args) throws InvalidTravelDuarationException {
        Scanner scanner = new Scanner(System.in);
        int option = 0;

        while (!(option >= 1 && option <= 3)) {
            System.out.println("Entre 1 For bus ticket, 2 for train ticket or 3 for plane ticket");
            option = scanner.nextInt();
        }

        System.out.println(" Enter the booking ref ");
        Long ref = scanner.nextLong();
        scanner.nextLine();

        System.out.println("Enter the origin");
        String origin = scanner.nextLine();

        System.out.println("Enter the Destination");
        String destination = scanner.nextLine();

        System.out.println("Enter the price");
        BigDecimal price = scanner.nextBigDecimal();
        scanner.nextLine();

        System.out.println("Enter the departure time");
        String dTime = scanner.nextLine();
        LocalDateTime departureTime = LocalDateTime.parse(dTime);

        System.out.println("Enter the Arrival time");
        String aTime = scanner.nextLine();
        LocalDateTime arrivalTime = LocalDateTime.parse(aTime);

        switch (option){
            case 1:
                BusTicket busTicket = new BusTicket(ref,origin,destination,price,departureTime,arrivalTime,null);
                System.out.println(busTicket);
                break;
            case 2:
                System.out.println("Entre the travel class");
                String tClass = scanner.nextLine();
                TravelClass travelClass = TravelClass.valueOf(tClass.toUpperCase());
                System.out.println("Entre the carriage number");
                int carriageNumber = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Entre the Seat number");
                int seatNumber = scanner.nextInt();
                TrainTicket trainTicket = new TrainTicket(ref,origin,destination,price,departureTime,arrivalTime,travelClass,carriageNumber,seatNumber);
                System.out.println(trainTicket);
                break;
            case 3: break;
        }
    }




}
