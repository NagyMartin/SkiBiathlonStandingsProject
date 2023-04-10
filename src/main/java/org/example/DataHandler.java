package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class DataHandler {
    protected List<Athlete> readCsvFile(String filePath) {
        List<Athlete> athleteList = new ArrayList<>();
        String line = "";
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filePath));
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
                String[] athleteAttributes = line.split(",");
                Athlete athlete = createAthlete(athleteAttributes);
                athleteList.add(athlete);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return athleteList;
    }

    protected Athlete createAthlete(String[] data) {
        Integer athleteNumber = Integer.parseInt(data[0]);
        String athleteName = data[1];
        String countryCode = data[2];
        String[] timeData = data[3].split(":");
        String timeTobeParsed = "PT" + timeData[0] + "M" + timeData[1] + "S";
        Duration skiTimeResult = Duration.parse(timeTobeParsed);
        String firstShootingRange = data[4];
        String secondShooting = data[5];
        String thirdShooting = data[6];
        return new Athlete(athleteNumber, athleteName, countryCode,
                skiTimeResult, firstShootingRange, secondShooting, thirdShooting);
    }
}
