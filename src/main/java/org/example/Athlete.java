package org.example;

import java.util.ArrayList;
import java.util.List;

public class Athlete {
    String athleteNumber;
    String athleteName;
    String countryCode;
    String skiTimeResult;
    String firstShootingRange;
    String secondShooting;
    String thirdShooting;

    List<Athlete> athleteList = new ArrayList<>();

    public Athlete(String athleteNumber, String athleteName, String countryCode,
                   String skiTimeResult, String firstShootingRange, String secondShooting, String thirdShooting) {
        this.athleteNumber = athleteNumber;
        this.athleteName = athleteName;
        this.countryCode = countryCode;
        this.skiTimeResult = skiTimeResult;
        this.firstShootingRange = firstShootingRange;
        this.secondShooting = secondShooting;
        this.thirdShooting = thirdShooting;
    }

}
