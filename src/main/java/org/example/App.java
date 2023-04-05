package org.example;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class App
{
    public static void main( String[] args ) {

        String filePath = "C:\\Users\\Dell\\Desktop\\Java Development" +
                "\\IoEnumsAnnotationsHomework\\Biathlon.csv";
        String line = "";
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filePath));
            while((line = reader.readLine()) != null){
                System.out.println(line);
                String[] athleteList = line.split(",");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
