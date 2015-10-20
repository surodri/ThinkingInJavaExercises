package polymorphism.meal;

import org.junit.Test;

import java.io.PrintStream;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class LunchTest {

    @Test
    public void constructorCallsPrintWithSelfMessage() {
        PrintStream printStream = mock(PrintStream.class);
        Lunch lunch = new Lunch(printStream);

        verify(printStream).println("Lunch()");
    }
}