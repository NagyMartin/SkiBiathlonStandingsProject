package org.example;


import java.time.Duration;
@ImportantClass
public class Athlete {
    protected Integer athleteNumber;
    protected String athleteName;
    protected CountryCode countryCode;
    protected Duration skiTimeResult;
    protected String firstShootingRange;
    protected String secondShooting;
    protected String thirdShooting;

    public Athlete(Integer athleteNumber, String athleteName, CountryCode countryCode,
                   Duration skiTimeResult, String firstShootingRange, String secondShooting, String thirdShooting) {
        this.athleteNumber = athleteNumber;
        this.athleteName = athleteName;
        this.countryCode = countryCode;
        this.skiTimeResult = skiTimeResult;
        this.firstShootingRange = firstShootingRange;
        this.secondShooting = secondShooting;
        this.thirdShooting = thirdShooting;
    }

    public Integer getAthleteNumber() {
        return athleteNumber;
    }

    public void setAthleteNumber(Integer athleteNumber) {
        this.athleteNumber = athleteNumber;
    }

    public String getAthleteName() {
        return athleteName;
    }

    public void setAthleteName(String athleteName) {
        this.athleteName = athleteName;
    }

    public CountryCode getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(CountryCode countryCode) {
        this.countryCode = countryCode;
    }

    public Duration getSkiTimeResult() {
        return skiTimeResult;
    }

    public void setSkiTimeResult(Duration skiTimeResult) {
        this.skiTimeResult = skiTimeResult;
    }

    public String getFirstShootingRange() {
        return firstShootingRange;
    }

    public void setFirstShootingRange(String firstShootingRange) {
        this.firstShootingRange = firstShootingRange;
    }

    public String getSecondShooting() {
        return secondShooting;
    }

    public void setSecondShooting(String secondShooting) {
        this.secondShooting = secondShooting;
    }

    public String getThirdShooting() {
        return thirdShooting;
    }

    public void setThirdShooting(String thirdShooting) {
        this.thirdShooting = thirdShooting;
    }

    @Override
    public String toString() {
        return "Athlete {" +
                " athleteNumber = " + athleteNumber +
                ", athleteName = " + athleteName + '\'' +
                ", countryCode = " + countryCode + '\'' +
                ", skiTimeResult = " + skiTimeResult + '\'' +
                ", firstShootingRange = " + firstShootingRange + '\'' +
                ", secondShooting = " + secondShooting + '\'' +
                ", thirdShooting = " + thirdShooting + '\'' +
                '}';
    }
}
