package polymorphism.cycle;

import org.junit.Test;

import java.io.PrintStream;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class BicycleTest {

    @Test
    public void driveShouldCallPrintStreamWithUpcastedMessage() {

        PrintStream printStream = mock(PrintStream.class);
        Bicycle bicycle = new Bicycle(printStream);

        bicycle.drive(bicycle);

        verify(printStream).println("Upcasted");
    }
}
