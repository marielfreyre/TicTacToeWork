import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.Scanner;

/**
 * Created by mfreyre on 8/6/15.
 */
public class OrchestratorOfGame {
    private  PrintStream printStream;
    private  BufferedReader bufferedReader;

    public OrchestratorOfGame(PrintStream printStream, BufferedReader bufferedReader) {
        this.printStream = printStream;
        this.bufferedReader = bufferedReader;


    }

    public String tellPlayerOneToMove() {

         printStream.println("Choose a number between 1 and 9 inclusive to determine where to place your symbol.");
        return null;
    }

    public String tellPlayerTwoToMove() {
        return null;
    }

    public String getPlayersMove() {

        String userInput=null;
        try {
            userInput = bufferedReader.readLine();
        } catch (IOException e) {
            printStream.println("Cannot implement user input");
        }
        return userInput;
    }
}
