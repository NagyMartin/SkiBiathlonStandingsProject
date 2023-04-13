package org.example;

import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ResultCalculatorTest {
    ResultCalculator resultCalculator = new ResultCalculator();
    @Test
    void displayingInOrderOfTimeResultsAnListOfAthletes() {
        List<Athlete> athleteList = new ArrayList<>();
        Athlete athlete1 = new Athlete(33, "Thomas Wayne", CountryCode.UK,
                Duration.parse("PT29M10S"), "xxxxx", "xooxo", "xxoxo");
        athleteList.add(athlete1);
        resultCalculator.calculateFinalResultAfterPenalties(athleteList);
        assertEquals(Duration.parse("PT30M0S"), athlete1.skiTimeResult);
    }

}