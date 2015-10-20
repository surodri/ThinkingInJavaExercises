package initializationAndCleanupChapter6;

import org.junit.Test;
import org.mockito.InOrder;

import java.io.PrintStream;

import static org.mockito.Mockito.*;

/**
 * Created by Thoughtworker on 9/9/15.
 */
public class Exercise14Test {

    @Test
    public void printingFields() {
        PrintStream printStream = mock(PrintStream.class);
        Exercise14 exercise14 = new Exercise14(printStream);
        InOrder order = inOrder(printStream);

        exercise14.printInitiation();

        order.verify(printStream).println("I am initialized, Yay!");
        order.verify(printStream).println("I am initialized by static block");
    }
}
