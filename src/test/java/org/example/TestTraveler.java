package org.example;

import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;
import java.util.Date;

import static java.util.List.of;

public class TestTraveler {
    Traveler testTraveler;

    @Before
    public void setUp(){
        testTraveler = new Traveler("Tariq Hook", "USA123456");
        testTraveler.setMoney(20000.00);
        testTraveler.setNoFlyList(false);
        LocalDate testDate = LocalDate.of(2021,01,15);
        CovidResults covidResults = new CovidResults(testDate,false);
        Destination destination = new Destination("Costa Rica");
        destination.setDistance(2116.02);
        destination.setCostPerMile(.07);
        destination.setRequireCovidTest(true);
    }
    @Test
    public void testBookATrip(){

    }
}
