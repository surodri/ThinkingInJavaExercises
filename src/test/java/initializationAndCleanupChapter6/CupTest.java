package initializationAndCleanupChapter6;

import org.junit.Test;

import java.io.PrintStream;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class CupTest {

    @Test
    public void fShouldPrintFunctionHeader() {
        PrintStream printStream = mock(PrintStream.class);

        CupExc13 cup = new CupExc13(0, printStream);
        cup.f(2);
        verify(printStream).println("f(2)");
    }
}
