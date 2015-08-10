import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;

/**
 * Created by mfreyre on 8/6/15.
 */
public class Main {
    public static void main(String[] args) {
       HashMap positionMap = makeBoard();

        Board gameBoard = new Board(System.out, positionMap);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        Player orchestrator = new Player(System.out, bufferedReader, gameBoard);
        gameBoard.displayBoard();
        String userInput = orchestrator.tellPlayerToMove();
        gameBoard.setPositionToSymbol(userInput, "x");
        gameBoard.displayBoard();




    }
    public static HashMap makeBoard(){
        HashMap<String, String> positionMap = new HashMap<>();
        positionMap.put("1", "    ");
        positionMap.put("2", "    ");
        positionMap.put("3", "    ");
        positionMap.put("4", "    ");
        positionMap.put("5", "    ");
        positionMap.put("6", "    ");
        positionMap.put("7", "    ");
        positionMap.put("8", "    ");
        positionMap.put("9", "    ");
        return positionMap;

    }
}
