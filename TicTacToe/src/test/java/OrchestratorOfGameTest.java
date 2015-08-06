import org.junit.Test;

import java.io.PrintStream;

import static org.mockito.Matchers.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

/**
 * Created by mfreyre on 8/6/15.
 */
public class OrchestratorOfGameTest {
    @Test
    public void shouldPromptPlayerForMove()  {
        PrintStream printStream = mock(PrintStream.class);
        OrchestratorOfGame orchestrator = new OrchestratorOfGame(printStream);

        orchestrator.tellPlayerToMove();
        verify(printStream).println(contains("Choose"));

    }


}
