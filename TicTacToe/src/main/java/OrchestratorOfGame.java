import java.io.PrintStream;

/**
 * Created by mfreyre on 8/6/15.
 */
public class OrchestratorOfGame {
    private final PrintStream printStream;

    public OrchestratorOfGame(PrintStream printStream) {
        this.printStream = printStream;
        
    }

    public void tellPlayerToMove() {
        printStream.println("Choose a number between 1 and 9 inclusive to determine where to place your symbol.");
    }
}
