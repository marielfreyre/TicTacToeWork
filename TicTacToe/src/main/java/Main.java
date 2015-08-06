import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by mfreyre on 8/6/15.
 */
public class Main {
    public static void main(String[] args) {
        Board gameBoard = new Board(System.out);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        OrchestratorOfGame orchestrator = new OrchestratorOfGame(System.out, bufferedReader, gameBoard);
        gameBoard.displayBoard();
        String userInput = orchestrator.tellPlayerOneToMove();
        gameBoard.setPositionToSymbol(userInput, "x");
        gameBoard.displayBoard();




    }
}
