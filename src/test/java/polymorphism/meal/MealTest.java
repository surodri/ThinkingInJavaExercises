package polymorphism.meal;

import org.junit.Test;

import java.io.PrintStream;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class MealTest {

    @Test
    public void constructorCallsPrintWithSelfMessage(){
        PrintStream printStream = mock(PrintStream.class);
        Meal meal = new Meal(printStream);

        verify(printStream).println("Meal()");
    }

    public static class PickleTest {

        @Test
        public void constructorCallsPrintWithSelfMessage() {
            PrintStream printStream = mock(PrintStream.class);
            Pickle pickle = new Pickle(printStream);

            verify(printStream).println("Pickle()");
        }
    }
}
