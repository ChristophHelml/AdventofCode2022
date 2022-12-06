package dayTwo;

import java.util.ArrayList;

public class RockPaperScissor {
    private ArrayList<String> playerOneMove;
    private ArrayList<String> playerTwoMove;

    public RockPaperScissor(ArrayList<String> playerOneMove, ArrayList<String> playerTwoMove) {
        this.playerOneMove = playerOneMove;
        this.playerTwoMove = playerTwoMove;
    }

    public ArrayList<String> getPlayerOneMove() {
        return playerOneMove;
    }

    public void setPlayerOneMove(ArrayList<String> playerOneMove) {
        this.playerOneMove = playerOneMove;
    }

    public ArrayList<String> getPlayerTwoMove() {
        return playerTwoMove;
    }

    public void setPlayerTwoMove(ArrayList<String> playerTwoMove) {
        this.playerTwoMove = playerTwoMove;
    }

    @Override
    public String toString() {
        return "Player One Move: " + playerOneMove + ", Player Two Move: " + playerTwoMove;
    }
}
