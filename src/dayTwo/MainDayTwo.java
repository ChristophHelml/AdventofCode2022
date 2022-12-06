package dayTwo;

import java.io.IOException;
import java.util.ArrayList;

public class MainDayTwo {
    public static void main(String[] args) {
        CSVReader csvReader = new CSVReader();
        int points = 0;
        int count = 0;

        // A = Rock, B = Paper, C = Scissor
        // X = Rock, Y = Paper, Z = Scissor


        try {
            RockPaperScissor rockPaperScissor = csvReader.readSingleCSV("src/dayTwo/DayTwo.csv");

            ArrayList<String> playerOne = rockPaperScissor.getPlayerOneMove();
            ArrayList<String> playerTwo = rockPaperScissor.getPlayerTwoMove();

            for (String s : playerOne) {
                String playerTwoInput = playerTwo.get(count);
                System.out.println("PlayerOne: " + s + " ,PlayerTwo: " + playerTwoInput);

                if (playerTwoInput.equals("X"))
                    points += 1;
                else if (playerTwoInput.equals("Y"))
                    points += 2;
                else if (playerTwoInput.equals("Z"))
                    points += 3;

                /*if (((s.equals("A"))&&(playerTwoInput.equals("X")))){
                    points += 3;
                } else if ((((s.equals("A"))&&(playerTwoInput.equals("Y"))))){
                    points += 6;
                } else if ((((s.equals("A"))&&(playerTwoInput.equals("Z"))))) {
                    points += 0;
                }

                if (((s.equals("B"))&&(playerTwoInput.equals("X")))){
                    points += 0;
                } else if ((((s.equals("B"))&&(playerTwoInput.equals("Y"))))){
                    points += 3;
                } else if ((((s.equals("B"))&&(playerTwoInput.equals("Z"))))) {
                    points += 6;
                }

                if (((s.equals("C"))&&(playerTwoInput).equals("X"))){
                    points += 6;
                } else if ((((s.equals("C"))&&(playerTwoInput.equals("Y"))))){
                    points += 0;
                } else if ((((s.equals("C"))&&(playerTwoInput.equals("Z"))))) {
                    points += 3;
                }*/

                if (((s.equals("B"))&&(playerTwoInput.equals("X"))))
                    points += 0;

                else if ((((s.equals("B"))&&(playerTwoInput.equals("Y")))))
                    points += 3;

                if ((((s.equals("B"))&&(playerTwoInput.equals("Z"))))) {
                    points += 6;
                }



                count++;
            }

            System.out.println("Points: " + points);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
