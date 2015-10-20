package polymorphism.meal;

import org.junit.Test;

import java.io.PrintStream;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class CheeseTest {
    @Test
    public void constructorCallsPrintWithSelfMessage() {
        PrintStream printStream = mock(PrintStream.class);
        Cheese cheese = new Cheese(printStream);

        verify(printStream).println("Cheese()");
    }
}