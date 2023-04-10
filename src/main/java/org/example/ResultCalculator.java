package org.example;

import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.util.List;

public class ResultCalculator {


    protected void calculateFinalResultAfterPenalties(List<Athlete> athleteList) {
        for (Athlete athlete : athleteList) {
            String[] s1 = new String[]{athlete.getFirstShootingRange().
                    concat(athlete.getSecondShooting()).concat(athlete.getThirdShooting())};

            for (String s : s1) {
                if(s.equals("O")){
                    Duration timePerformance = athlete.getSkiTimeResult();
                    timePerformance.plus(10, ChronoUnit.SECONDS);
                }
            }
        }
    }

    protected void displayPodium(List<Athlete> athleteList) {
        System.out.println("\nPodium after shooting penalties is: ");
        for(Athlete athlete: athleteList) {
            athleteList.sort(new SortByTime());
            System.out.println(athlete);
        }
    }
}
