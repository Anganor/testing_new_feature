package com.kodilla.exception.test;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class FlightSearcher {
    public void findFlight(Flight flight) throws RouteNotFoundException {
        Map<String, Boolean> availableAirports = new HashMap<>();
        availableAirports.put("Poznań", true);
        availableAirports.put("Kraków", true);
        availableAirports.put("Warszawa", false);
        availableAirports.put("Wrocław", false);
        availableAirports.put("Katowice", true);
        availableAirports.put("Gdańsk", true);
        availableAirports.put("Gdynia", true);

        if (availableAirports.containsKey(flight.arrivalAirport) && availableAirports.containsKey(flight.departureAirport)) {
            if (!availableAirports.get(flight.arrivalAirport)) {
                System.out.println("Chosen airport: " + flight.arrivalAirport + ", is currently under maintenance.");
            } else if (!availableAirports.get(flight.departureAirport)) {
                System.out.println("Chosen airport: " + flight.departureAirport + ", is currently under maintenance.");
            }
        }
        if (!availableAirports.containsKey(flight.getDepartureAirport()) && !availableAirports.containsKey(flight.getArrivalAirport())) {
            throw new RouteNotFoundException("Both chosen airports are not on our map.");
        }

        if (!availableAirports.containsKey(flight.getArrivalAirport())) {
            throw new RouteNotFoundException("Your destination airport: " + flight.getArrivalAirport() + ", is not on our map.");
        }

        if (!availableAirports.containsKey(flight.getDepartureAirport())) {
            throw new RouteNotFoundException("Your starting airport: " + flight.getDepartureAirport() + ", is not on our map.");
        }
    }
}
