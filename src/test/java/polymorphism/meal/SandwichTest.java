package polymorphism.meal;

import org.junit.Test;

import java.io.PrintStream;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class SandwichTest {

    //test with in one test because its basic and want to verify it is all at done at once

    @Test
    public void constructorCallsPrintWithSelfMessage() {
        PrintStream printStream = mock(PrintStream.class);
        Sandwich sandwich = new Sandwich(printStream);

        verify(printStream).println("Sandwich()");
    }

    @Test
    public void constructorCallsPrintWithCheeseMessage() {
        PrintStream printStream = mock(PrintStream.class);
        Sandwich sandwich = new Sandwich(printStream);

        verify(printStream).println("Cheese()");
    }


    @Test
    public void constructorCallsPrintWithBreadMessage() {
        PrintStream printStream = mock(PrintStream.class);
        Sandwich sandwich = new Sandwich(printStream);

        verify(printStream).println("Bread()");
    }


    @Test
    public void constructorCallsPrintWithLettuceMessage() {
        PrintStream printStream = mock(PrintStream.class);
        Sandwich sandwich = new Sandwich(printStream);

        verify(printStream).println("Lettuce()");
    }

    @Test
    public void constructorCallsPrintWithPickleMessage() {
        PrintStream printStream = mock(PrintStream.class);
        Sandwich sandwich = new Sandwich(printStream);

        verify(printStream).println("Pickle()");
    }
}
