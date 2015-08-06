import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;

/**
 * Created by mfreyre on 8/6/15.
 */
public class Main {
    public static void main(String[] args) {
        HashMap<String, String> positionMap = null;
        positionMap.put("1", "    ");
        positionMap.put("2", "    ");
        positionMap.put("3", "    ");
        positionMap.put("4", "    ");
        positionMap.put("5", "    ");
        positionMap.put("6", "    ");
        positionMap.put("7", "    ");
        positionMap.put("8", "    ");
        positionMap.put("9", "    ");
        Board gameBoard = new Board(System.out, positionMap);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        OrchestratorOfGame orchestrator = new OrchestratorOfGame(System.out, bufferedReader, gameBoard);
        gameBoard.displayBoard();
        String userInput = orchestrator.tellPlayerOneToMove();
        gameBoard.setPositionToSymbol(userInput, "x");
        gameBoard.displayBoard();




    }
}
