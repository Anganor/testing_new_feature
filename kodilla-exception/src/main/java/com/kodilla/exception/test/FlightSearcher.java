package com.kodilla.exception.test;

import java.util.*;

public class FlightSearcher {
    public Map<String, Boolean> findFlight(Flight flight) {
        HashMap<String, Boolean> availableFlights = new HashMap<>();
        availableFlights.put("Katowice", true);
        availableFlights.put("Kraków", true);
        availableFlights.put("Warszawa", true);
        availableFlights.put("Wrocław", false);
        return availableFlights;
    }
}
