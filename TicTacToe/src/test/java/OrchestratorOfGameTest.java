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
//    @Before
//    public void setUp() throws Exception {
//        BufferedReader bufferedReader;
//
//    }

    @Test
    public void shouldPromptPlayer1ForMove() throws IOException {
        BufferedReader bufferedReader = mock(BufferedReader.class);
        PrintStream printStream = mock(PrintStream.class);
        OrchestratorOfGame orchestrator = new OrchestratorOfGame(printStream, bufferedReader);


        orchestrator.tellPlayerOneToMove();

        verify(printStream).println(contains("Choose"));

    }

    @Test
    public void shouldTakeInUserInput() throws Exception {
        PrintStream printStream = mock(PrintStream.class);
        BufferedReader bufferedReader = mock(BufferedReader.class);
        OrchestratorOfGame orchestrator = new OrchestratorOfGame(printStream, bufferedReader);
        when(bufferedReader.readLine()).thenReturn("1");

        assertThat(orchestrator.getPlayersMove(), is("1"));

    }


}
