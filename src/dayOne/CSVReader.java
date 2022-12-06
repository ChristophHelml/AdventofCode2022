package dayOne;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;

public class CSVReader {

    public LinkedList<Integer> readSingleCSV(String file) throws IOException {
        String line;
        int calories = 0;
        int mostCalories = 0;

        LinkedList<Integer> linkedList = new LinkedList<>();

        File f = new File (file);

        try(BufferedReader bufferedReader=new BufferedReader(new FileReader(file))){
            while ((line = bufferedReader.readLine())!=null){

                if (!line.equals("")){
                    calories += Integer.parseInt(line);
                }

                if ((line.equals(""))&&(calories>mostCalories)){
                    linkedList.add(calories);
                    calories = 0;
                }

                if (line.equals("")){
                    calories = 0;
                }
            }
        }
        return linkedList;
    }
}
