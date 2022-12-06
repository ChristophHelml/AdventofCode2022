package dayTwo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class CSVReader {

    public RockPaperScissor readSingleCSV(String file) throws IOException {
        String line;
        String[] elements;

        RockPaperScissor rockPaperScissor = new RockPaperScissor(new ArrayList<String>(), new ArrayList<String>());

        File f = new File (file);

        try(BufferedReader bufferedReader=new BufferedReader(new FileReader(file))){
            while ((line = bufferedReader.readLine())!=null){
                elements=line.split(" ");
                rockPaperScissor.getPlayerOneMove().add(elements[0]);
                rockPaperScissor.getPlayerTwoMove().add(elements[1]);
            }
        }
        return rockPaperScissor;
    }
}
