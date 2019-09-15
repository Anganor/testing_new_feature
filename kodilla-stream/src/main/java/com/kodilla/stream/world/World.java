package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.*;

public final class World {
    private final List<Continent> listOfContinents = new ArrayList<>();

    public void addContinent(Continent continent) {
        listOfContinents.add(continent);
    }

    public BigDecimal getPeopleQuantity() {
        return listOfContinents.stream()
                .flatMap(Continent -> Continent.getListOfCountries().stream())
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));
    }
}
