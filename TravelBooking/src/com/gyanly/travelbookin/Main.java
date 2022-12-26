package com.gyanly.travelbookin;

import com.gyanly.travelbookin.bookingProcess.BookingSystem;
import com.gyanly.travelbookin.bookingProcess.CheapTravelBookingSystem;
import com.gyanly.travelbookin.bookingProcess.EnjoybleToursBookingSystem;
import com.gyanly.travelbookin.domain.BusTicket;
import com.gyanly.travelbookin.domain.TrainTicket;
import com.gyanly.travelbookin.domain.TravelClass;
import com.gyanly.travelbookin.domain.TravelTicket;
import com.gyanly.travelbookin.exceptions.InvalidTravelDuarationException;
import com.gyanly.travelbookin.utilities.OriginSortComparator;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws InvalidTravelDuarationException {

        TrainTicket trainTicket2 = null;
        try {
            trainTicket2 = new TrainTicket(123L, "Delhi", "Pune",
                    new BigDecimal("59.0"), LocalDateTime.of(2022, 11,
                    6, 16, 03),
                    LocalDateTime.of(2022, 11, 6, 20, 03),
                    TravelClass.SECOND, 3, 55);
            trainTicket2.cancel();
            trainTicket2.upgrade();
        } catch (InvalidTravelDuarationException e) {
//            throw new RuntimeException(e);
            System.out.println("Invalid date in Train ticket booking");
        }


//        String[] providers = {"First Provider","Second Provider"};
        ArrayList<String> providers = new ArrayList<>();

        providers.add("First Bus Company");
        providers.add("Second Bus Company");
        providers.add("Third Bus Company");

        try {
            BusTicket busTicket = new BusTicket(124L, "Delhi", "Jaipur", new BigDecimal("45.0"),
                    LocalDateTime.of(2022, 11, 7, 16, 3),
                    LocalDateTime.of(2022, 11, 7, 19, 3), providers);
        } catch (InvalidTravelDuarationException e) {
//            throw new RuntimeException(e);
            System.out.println("Invalid date in bus ticket booking");
        }

        BusTicket busTicket1 = new BusTicket(124L, "Delhi", "Jaipur", new BigDecimal("45.0"),
                LocalDateTime.of(2022, 11, 7, 16, 3),
                LocalDateTime.of(2022, 11, 7, 19, 3), providers);

        BusTicket busTicket2 = new BusTicket(125L, "Delhi", "Mumbai", new BigDecimal("45.0"),
                LocalDateTime.of(2022, 11, 7, 16, 3),
                LocalDateTime.of(2022, 11, 7, 19, 3), providers);

        BusTicket busTicket3 = new BusTicket(126L, "Mumbai", "Jaipur", new BigDecimal("45.0"),
                LocalDateTime.of(2022, 11, 7, 16, 3),
                LocalDateTime.of(2022, 11, 7, 19, 3), providers);

        List<TravelTicket> tickets = new LinkedList<>();

        tickets.add(busTicket1);
        tickets.add(busTicket2);
        tickets.add(busTicket2);
        tickets.add(busTicket2);
        tickets.add(busTicket2);
        tickets.add(busTicket3);
        tickets.add(trainTicket2);


//        Collections.sort(tickets);

//        Collections.sort(tickets, new OriginSortComparator());

//        Collections.sort(tickets, new Comparator<TravelTicket>() {
//            @Override
//            public int compare(TravelTicket o1, TravelTicket o2) {
//                return o1.getOrigin().compareTo(o2.getOrigin());
//            }
//        });

//        Collections.sort(tickets,(a,b)-> a.getOrigin().compareTo(b.getOrigin()));

//        tickets.stream().forEach( t -> System.out.println(t));
        System.out.println("-------------------------");
//        tickets.stream().filter(a ->a.getOrigin().equals("Mumbai")).forEach(t-> System.out.println(t));
        List<TravelTicket> mumbaiTicket = tickets.stream().filter(a ->a.getOrigin().equals("Mumbai")).collect(Collectors.toList());
        System.out.println(mumbaiTicket);

//        {2,3,4,5} == > {4,9,16,25}

//        List<Integer> number = Arrays.asList(2,3,4,5);
//        List<Integer> square = number.stream().map(x -> x*x).collect(Collectors.toList());
//        System.out.println(square);

//        for (TravelTicket b:tickets){
//            System.out.println(b);
//        }

    }
}