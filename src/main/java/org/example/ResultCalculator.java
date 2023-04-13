package org.example;

import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.util.List;

public class ResultCalculator {

    /**
     * Calculating the final result method.
     * @param athleteList Takes an input of a list of Athlete objects.
     *    Method modifies the time result based on the three shooting results. Each miss, registered as an "o",
     *                    adds 10 seconds to the time.
     * @return Returns the Athlete list.
     */
    protected List<Athlete> calculateFinalResultAfterPenalties(List<Athlete> athleteList) {
        for (Athlete athlete : athleteList) {
            String s1 = athlete.getFirstShootingRange().concat(athlete.getSecondShooting()
                    .concat(athlete.getThirdShooting()));
            String[] shotResult = s1.split("");
            for (String shot: shotResult) {
                if(shot.equals("o")) {
                    Duration timePerformance = athlete.getSkiTimeResult();
                    timePerformance.plus(10, ChronoUnit.SECONDS);
                    athlete.setSkiTimeResult(timePerformance);
                } else if (!shot.equals("x")){
                    System.out.println("The shot result registered is not valid.");
                }
            }
        } return athleteList;
    }

    /**
     * Podium display method.
     * @param athleteList Takes an input of a list of Athlete objects.
     *      Method sorts using an comparator each Athlete object based on time results.
     * @return Returns the Athlete list.
     */
    protected List<Athlete> displayPodium(List<Athlete> athleteList) {
        System.out.println("\nPodium after shooting penalties is: ");
        for(int i = 0; i < athleteList.size(); i++) {
            athleteList.sort(new SortByTime());
            System.out.println(athleteList);
        } return athleteList;
    }
}
