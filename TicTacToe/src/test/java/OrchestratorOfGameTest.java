import org.junit.Before;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintStream;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.mockito.Matchers.contains;
import static org.mockito.Mockito.*;

/**
 * Created by mfreyre on 8/6/15.
 */
public class OrchestratorOfGameTest {
    BufferedReader bufferedReader;
    PrintStream printStream;
    Board board;
    private OrchestratorOfGame orchestrator;

    @Before
    public void setUp() throws Exception {

        board = mock(Board.class);
        printStream = mock(PrintStream.class);
        bufferedReader = mock(BufferedReader.class);
        orchestrator = new OrchestratorOfGame(printStream, bufferedReader, board);

    }

    @Test
    public void shouldPromptPlayer1ForMove() throws IOException {

        orchestrator.tellPlayerToMove();
        verify(printStream).println(contains("Choose"));

    }

    @Test
    public void shouldTakeInUserInput() throws Exception {

        when(bufferedReader.readLine()).thenReturn("1");
        assertThat(orchestrator.getPlayersMove(), is("1"));

    }

    @Test
    public void shouldMarkBoardCorrectlyForPlayerOne() throws Exception {

        when(bufferedReader.readLine()).thenReturn("1");
        orchestrator.recordPlayerOnesMove("1");
        verify(board).setPositionToSymbol("1", "X");


    }

    @Test
    public void shouldMarkBoardCorrectlyForPlayerTwo() throws Exception {

        when(bufferedReader.readLine()).thenReturn("1");
        orchestrator.recordPlayerTwosMove("1");
        verify(board).setPositionToSymbol("1", "O");


    }


}
