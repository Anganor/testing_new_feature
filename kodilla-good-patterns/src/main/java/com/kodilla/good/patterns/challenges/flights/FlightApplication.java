package com.kodilla.good.patterns.challenges.flights;

import java.util.Set;

public class FlightApplication {
    public static void main(String[] args) {
        FlightRepository flightRepository = new FlightRepository();
        Set<Flight> connections = flightRepository.getListOfFlights();

        FlightSearcher flightSearcher1 = new FlightSearcher();
        flightSearcher1.flightsFrom(connections, "KTW");
        System.out.println();
        FlightSearcher flightSearcher2 = new FlightSearcher();
        flightSearcher2.flightsTo(connections, "WRO");
        System.out.println();
        FlightSearcher flightSearcher3 = new FlightSearcher();
        flightSearcher3.flightsVia("KTW", "WRO");
    }
}
