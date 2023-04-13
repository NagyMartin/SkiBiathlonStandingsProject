package org.example;

import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

class DataHandlerTest {
    DataHandler dataHandler = new DataHandler();
    @Test
    void createAnAthleteBasedOnAStringArrayData() {
        String[] data = {"33", "Thomas Wayne", "UK", "29:10", "xxxxx", "xooxo", "xxoxo"};
        assertEquals(new Athlete(33, "Thomas Wayne", CountryCode.UK,
                Duration.parse("PT29M10S"), "xxxxx", "xooxo", "xxoxo")
                ,dataHandler.createAthlete(data));
    }
}