package com.kodilla.good.patterns.challenges.flights;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class FlightSearcher {
    public void flightsTo(Set<Flight> flightsTo, String arrivalAirport) {
        System.out.println("Available connections to " + arrivalAirport + " airport:");
        flightsTo.stream()
                .filter(f -> f.getArrivalAirport().equals(arrivalAirport))
                .forEach(System.out::println);
    }

    public void flightsFrom(Set<Flight> flightsFrom, String departureAirport) {
        System.out.println("Available connections from " + departureAirport + " airport:");
        flightsFrom.stream()
                .filter(f -> f.getDepartureAirport().equals(departureAirport))
                .forEach(System.out::println);
    }

    public void flightsVia(String departureAirport, String arrivalAirport) {
        FlightRepository flightRepository = new FlightRepository();
        Set<Flight> flightsList = flightRepository.getListOfFlights();
        Set<Flight> flightsListFrom = flightsList.stream()
                .filter(f -> f.getDepartureAirport().equals(departureAirport))
                .collect(Collectors.toSet());
        Set<Flight> flightsListTo = flightsList.stream()
                .filter(f -> f.getArrivalAirport().equals(arrivalAirport))
                .collect(Collectors.toSet());
        for(Flight flightFrom : flightsListFrom){
            for(Flight flightTo : flightsListTo){
                if(flightFrom.getArrivalAirport().equals(flightTo.getDepartureAirport())) {
                    System.out.println("Available indirect connections: ");
                    System.out.println(flightFrom);
                    System.out.println(flightTo);
                }
            }
        }
    }
}
