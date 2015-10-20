package initializationAndCleanupChapter6;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InOrder;

import java.io.PrintStream;

import static org.mockito.Mockito.inOrder;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

/**
 * Created by Thoughtworker on 9/9/15.
 */
public class Exercises16_17_18_19Test {

    private PrintStream printStream;

    @Before
    public void setUp() throws Exception {
        printStream = mock(PrintStream.class);
    }

    @Test
    public void printShouldPrintAllElementsInArray() {

        Exercises16_17_18_19 exercise16 = new Exercises16_17_18_19(printStream);
        
        String array[] = { "a", "b", "c"};
        exercise16.print(array);

        InOrder order = inOrder(printStream);
        order.verify(printStream).println("a");
        order.verify(printStream).println("b");
        order.verify(printStream).println("c");
    }

    @Test
    public void constructorShouldTakeStringArgumentExercise17() {
        String argument = "String argument";
        Exercises16_17_18_19 exercise16 = new Exercises16_17_18_19(printStream);
        exercise16.printString(argument);

        verify(printStream).println(argument);
    }

    @Test
    public void flurpShouldTakeAVarangStringArray() {

        String ama = "ama";
        String be = "be";
        Exercises16_17_18_19 exercise19 = new Exercises16_17_18_19(printStream);

        exercise19.flurp(be,ama);

        InOrder order = inOrder(printStream);
        order.verify(printStream).println(be);
        order.verify(printStream).println(ama);
    }

    @Test
    public void mainShouldPrintElementsInAragsArrayExercise20(){

        String you = "you";
        String are = "are";
        String what = "what";

        Exercises16_17_18_19.main(you, are, what);
    }
}
