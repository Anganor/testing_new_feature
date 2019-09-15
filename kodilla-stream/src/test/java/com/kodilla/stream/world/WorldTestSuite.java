package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity() {
        //Given / Arrange
        Country Poland = new Country("Poland", new BigDecimal("37800000"));
        Country Austria = new Country("Austria", new BigDecimal("8800000"));
        Country Italy = new Country("Italy", new BigDecimal("60500000"));
        Country Germany = new Country("Germany", new BigDecimal("82400000"));
        Country Spain = new Country("Spain", new BigDecimal("46500000"));
        Country Andorra = new Country("Andorra", new BigDecimal("80000"));
        Country China = new Country("China", new BigDecimal("1393000000"));
        Country Mongolia = new Country("Mongolia", new BigDecimal("3200000"));
        Country India = new Country("India", new BigDecimal("1369000000"));
        Country Philippines = new Country("Philippines", new BigDecimal("108000000"));
        Country Canada = new Country("Canada", new BigDecimal("37300000"));
        Country USA = new Country("USA", new BigDecimal("330000000"));

        Continent Europe = new Continent("Europe");
        Continent Asia = new Continent("Asia");
        Continent NorthAmerica = new Continent("NorthAmerica");

        Europe.addCountry(Poland);
        Europe.addCountry(Austria);
        Europe.addCountry(Italy);
        Europe.addCountry(Germany);
        Europe.addCountry(Spain);
        Europe.addCountry(Andorra);
        Asia.addCountry(China);
        Asia.addCountry(Mongolia);
        Asia.addCountry(India);
        Asia.addCountry(Philippines);
        NorthAmerica.addCountry(Canada);
        NorthAmerica.addCountry(USA);

        World theWorld = new World();
        theWorld.addContinent(Europe);
        theWorld.addContinent(Asia);
        theWorld.addContinent(NorthAmerica);

        //When / Act
        BigDecimal theWholeWorldPopulation = theWorld.getPeopleQuantity();
        BigDecimal result = new BigDecimal("3476580000");

        //Then / Assert
        Assert.assertEquals(result, theWholeWorldPopulation);
    }
}
