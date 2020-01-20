package com.kodilla.exception.test;

public class FlightSearcherRunner {
    public static void main(String[] args) {
        Flight flight1 = new Flight("Katowice", "Warszawa");
        Flight flight2 = new Flight("Katowice", "Kraków");
        Flight flight3 = new Flight("Kraków", "Wrocław");
        Flight flight4 = new Flight("Sosnowiec", "Katowice");
        Flight flight5 = new Flight("Gdańsk", "Malbork");
        Flight flight6 = new Flight("Białystok", "Szczecin");

        FlightSearcher flightSearcher = new FlightSearcher();

        try {
            flightSearcher.findFlight(flight1);
            System.out.println("Flight from: " + flight1.getDepartureAirport() + ", to: " + flight1.getArrivalAirport() + " is available.");
        } catch (RouteNotFoundException e) {
            e.printStackTrace();
        }

        try {
            flightSearcher.findFlight(flight2);
            System.out.println("Flight from: " + flight2.getDepartureAirport() + ", to: " + flight2.getArrivalAirport() + " is available.");
        } catch (RouteNotFoundException e) {
            e.printStackTrace();
        }

        try {
            flightSearcher.findFlight(flight3);
            System.out.println("Flight from: " + flight3.getDepartureAirport() + ", to: " + flight3.getArrivalAirport() + " is available.");
        } catch (RouteNotFoundException e) {
            e.printStackTrace();
        }

        try {
            flightSearcher.findFlight(flight4);
            System.out.println("Flight from: " + flight4.getDepartureAirport() + ", to: " + flight4.getArrivalAirport() + " is available.");
        } catch (RouteNotFoundException e) {
            e.printStackTrace();
        }

        try {
            flightSearcher.findFlight(flight5);
            System.out.println("Flight from: " + flight5.getDepartureAirport() + ", to: " + flight5.getArrivalAirport() + " is available.");
        } catch (RouteNotFoundException e) {
            e.printStackTrace();
        }

        try {
            flightSearcher.findFlight(flight6);
            System.out.println("Flight from: " + flight6.getDepartureAirport() + ", to: " + flight6.getArrivalAirport() + " is available.");
        } catch (RouteNotFoundException e) {
            e.printStackTrace();
        }
    }
}
