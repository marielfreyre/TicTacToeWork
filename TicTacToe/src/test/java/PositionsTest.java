import org.junit.Test;

import java.io.PrintStream;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.mockito.Mockito.mock;

/**
 * Created by mfreyre on 8/6/15.
 */
public class PositionsTest {
    @Test
    public void shouldPrintAppearanceWhenPrinting() {
        PrintStream printStream = mock(PrintStream.class);
        Positions position = new Positions();

        assertThat(position.toString(), is("    "));


    }

    @Test
    public void shouldSetPositionAppearanceToAppropriateSymbol() {
        Positions position = new Positions();
        position.placeSymbol("X");
        assertThat(position.toString(), is("  X  "));

    }


}
