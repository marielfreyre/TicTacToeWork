/**
 * Created by mfreyre on 8/6/15.
 */
public class Main {
    public static void main(String[] args) {
        Board gameBoard = new Board(System.out);
        OrchestratorOfGame orchestrator = new OrchestratorOfGame(System.out);
        gameBoard.displayBoard();
        orchestrator.tellPlayerToMove();
        gameBoard.setPositionToSymbol("1", "x");
        gameBoard.displayBoard();




    }
}
