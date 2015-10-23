package polymorphism.cycle;



import org.junit.Test;

import java.io.PrintStream;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class UnicycleTest {

    @Test
    public void driveShouldCallPrintStreamWithUpcastedMessage() {


    PrintStream printStream = mock(PrintStream.class);
    Cycle cycle = mock(Cycle.class);
        Unicycle unicycle = new Unicycle(printStream);

    unicycle.drive(cycle);

    verify(printStream).println("Upcasted");
    }

}
