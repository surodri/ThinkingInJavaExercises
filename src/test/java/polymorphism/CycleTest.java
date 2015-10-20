package polymorphism;

import org.junit.Test;

import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class CycleTest {

    @Test
    public void rideShouldCallPrintWithUpcastedMessage(){

        PrintStream printStatement = mock(PrintStream.class);
        Cycle cycle = new Cycle(printStatement);

        cycle.ride();

        verify(printStatement).println("Upcasted");
    }

    @Test
    public void rideShouldCallPrintStreamWithNumberOfWheels(){

        PrintStream printStatement = mock(PrintStream.class);
        Cycle cycle = new Cycle(printStatement);

        cycle.ride();

        verify(printStatement).println("Number of wheels 0");
    }

    @Test
    public void wheelsShouldReturnNumberOfWheels(){

        PrintStream printStatement = mock(PrintStream.class);
        Cycle cycle = new Cycle(printStatement);

        int numberOfWheels = cycle.wheels();

        assertThat(numberOfWheels).isEqualTo(0);
    }




}
