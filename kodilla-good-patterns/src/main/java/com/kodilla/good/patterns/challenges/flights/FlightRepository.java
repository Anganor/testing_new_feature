package com.kodilla.good.patterns.challenges.flights;

import java.util.HashSet;
import java.util.Set;

public class FlightRepository {
    private Set<Flight> listOfFlights = new HashSet<>();

    public FlightRepository() {
        listOfFlights.add(new Flight("KTW", "WAW"));
        listOfFlights.add(new Flight("KTW", "KRK"));
        listOfFlights.add(new Flight("KTW", "WRO"));
        listOfFlights.add(new Flight("KTW", "POZ"));
        listOfFlights.add(new Flight("KTW", "GDN"));
        listOfFlights.add(new Flight("KTW", "BZG"));
        listOfFlights.add(new Flight("WAW", "WRO"));
        listOfFlights.add(new Flight("KRK", "WRO"));
        listOfFlights.add(new Flight("POZ", "WRO"));
        listOfFlights.add(new Flight("GDN", "WRO"));
    }

    public Set<Flight> getListOfFlights() {
        return listOfFlights;
    }

    public void addFlight(Flight flight) {
        listOfFlights.add(flight);
    }
}
