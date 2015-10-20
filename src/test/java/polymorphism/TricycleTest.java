package polymorphism;

import org.junit.Test;

import java.io.PrintStream;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class TricycleTest {


    @Test
    public void driveShouldCallPrintStreamWithUpcastedMessage() {


        PrintStream printStream = mock(PrintStream.class);
        Tricycle tricycle = new Tricycle(printStream);

        tricycle.drive(tricycle);

        verify(printStream).println("Upcasted");
    }



}
