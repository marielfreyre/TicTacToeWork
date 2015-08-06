import org.junit.Before;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintStream;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.mockito.Matchers.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

/**
 * Created by mfreyre on 8/6/15.
 */
public class OrchestratorOfGameTest {
    BufferedReader bufferedReader;
    PrintStream printStream;
    private OrchestratorOfGame orchestrator;

    @Before
    public void setUp() throws Exception {
        Board board = mock(Board.class);
        PrintStream printStream = mock(PrintStream.class);
        BufferedReader bufferedReader = mock(BufferedReader.class);
        OrchestratorOfGame orchestrator = new OrchestratorOfGame(printStream, bufferedReader, board);

    }

    @Test
    public void shouldPromptPlayer1ForMove() throws IOException {

        PrintStream printStream = mock(PrintStream.class);
        BufferedReader bufferedReader = mock(BufferedReader.class);
        Board board = mock(Board.class);
        OrchestratorOfGame orchestrator = new OrchestratorOfGame(printStream, bufferedReader, board);



        orchestrator.tellPlayerOneToMove();

        verify(printStream).println(contains("Choose"));

    }

    @Test
    public void shouldTakeInUserInput() throws Exception {
        PrintStream printStream = mock(PrintStream.class);
        BufferedReader bufferedReader = mock(BufferedReader.class);
        Board board = mock(Board.class);
        OrchestratorOfGame orchestrator = new OrchestratorOfGame(printStream, bufferedReader, board);


        when(bufferedReader.readLine()).thenReturn("1");

        assertThat(orchestrator.getPlayersMove(), is("1"));

    }

    @Test
    public void shouldMarkBoardCorrectlyForPlayerOne() throws Exception {
        PrintStream printStream = mock(PrintStream.class);
        BufferedReader bufferedReader = mock(BufferedReader.class);
        Board board = mock(Board.class);
        OrchestratorOfGame orchestrator = new OrchestratorOfGame(printStream, bufferedReader,board );

        when(bufferedReader.readLine()).thenReturn("1");
        orchestrator.recordPlayerOnesMove("1");
        verify(board).setPositionToSymbol("1", "X");






    }
    @Test
    public void shouldMarkBoardCorrectlyForPlayerTwo() throws Exception {
        PrintStream printStream = mock(PrintStream.class);
        BufferedReader bufferedReader = mock(BufferedReader.class);
        Board board = mock(Board.class);
        OrchestratorOfGame orchestrator = new OrchestratorOfGame(printStream, bufferedReader,board );

        when(bufferedReader.readLine()).thenReturn("1");
        orchestrator.recordPlayerTwosMove("1");
        verify(board).setPositionToSymbol("1", "O");






    }
}
