import java.io.PrintStream;

/*
 * This Java source file was auto generated by running 'gradle buildInit --type java-library'
 * by 'mfreyre' at '8/6/15 1:24 PM' with Gradle 2.5
 *
 * @author mfreyre, @date 8/6/15 1:24 PM
 */
public class Board {
    private final PrintStream printStream;

    public Board(PrintStream printStream) {
        this.printStream = printStream;
    }



    public void displayBoard() {
        printStream.println("   |   |   ");
        printStream.println(" ---------");
        printStream.println("   |   |   ");
        printStream.println(" ---------");
        printStream.println("   |   |   ");

    }
}
