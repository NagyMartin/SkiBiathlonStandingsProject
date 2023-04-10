package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Time;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
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
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("mm:ss");
        LocalTime skiTimeResult = LocalTime.from(formatter.parse(data[3]));
        String firstShootingRange = data[4];
        String secondShooting = data[5];
        String thirdShooting = data[6];
        return new Athlete(athleteNumber, athleteName, countryCode,
                skiTimeResult, firstShootingRange, secondShooting, thirdShooting);
    }
}
