package polymorphism.meal;

import org.junit.Test;

import java.io.PrintStream;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class LettuceTest {

    @Test
    public void constructorCallsPrintWithSelfMessage() {
        PrintStream printStream = mock(PrintStream.class);
        Lettuce lettuce = new Lettuce(printStream);

        verify(printStream).println("Lettuce()");
    }
}