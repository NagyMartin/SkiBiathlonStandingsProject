package org.example;


public class App
{
    public static void main( String[] args ) {

        String filePath = "C:\\Users\\Dell\\Desktop\\Java Development" +
                "\\IoEnumsAnnotationsHomework\\Biathlon.csv";

        DataHandler dataHandler = new DataHandler();

        dataHandler.readCsvFile(filePath);

        System.out.println();

        ResultCalculator calculator = new ResultCalculator();

        calculator.calculateFinalResultAfterPenalties(dataHandler.readCsvFile(filePath));

        System.out.println();

        calculator.displayPodium(dataHandler.readCsvFile(filePath));
    }
}
