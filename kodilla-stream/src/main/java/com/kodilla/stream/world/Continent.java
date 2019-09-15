package com.kodilla.stream.world;

import java.util.*;

public final class Continent {
    private final String continentName;
    private final List<Country> listOfCountries = new ArrayList<>();

    public Continent(final String continentName) {
        this.continentName = continentName;
    }

    public void addCountry(Country country) {
        listOfCountries.add(country);
    }

    public String getContinentName() {
        return continentName;
    }

    public List<Country> getListOfCountries() {
        return listOfCountries;
    }
}
