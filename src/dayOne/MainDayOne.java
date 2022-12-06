package dayOne;

import java.io.IOException;
import java.util.Collections;
import java.util.LinkedList;

public class MainDayOne {
    public static void main(String[] args) {
        LinkedList<Integer> mostCalories;


        CSVReader csvReader = new CSVReader();

        try {
            mostCalories = csvReader.readSingleCSV("src/dayOne/DayOne.csv");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        Collections.sort(mostCalories);

        for (Integer mostCalory : mostCalories) {
            System.out.println(mostCalory);
        }

        System.out.println(65401 + 65413 + 66487);
    }
}