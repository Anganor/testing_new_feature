package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Collectors;

public final class World {
    private final Set<Continent> listOfContinents = new HashSet<>();

    public Set<Continent> getListOfContinents() {
        return listOfContinents;
    }

    public BigDecimal getPeopleQuantity() {
        return listOfContinents.stream()
                .flatMap(Continent -> Continent.getListOfCountries().stream())
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));
    }
}
