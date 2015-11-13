package holdingYourObjects;

import chapter11InnerClasses.Selector;
import org.junit.Test;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyZeroInteractions;

/**
 * Created by srodriguez on 11/12/15.
 */
public class SequenceTest {

    @Test
    public void addPrintsZeroItemsWhenNoneAdded(){
        List<Object> items = new ArrayList<Object>();
        PrintStream printStream = mock(PrintStream.class);
        Sequence sequence = new Sequence(items, printStream);
        Selector selector = sequence.selector();
        selector.printAll();

        verifyZeroInteractions(printStream);
    }


    @Test
    public void addPrintsTwoItemsWhenTwoAdded(){
        List<Object> items = new ArrayList<Object>();
        PrintStream printStream = mock(PrintStream.class);
        Sequence sequence = new Sequence(items, printStream);
        sequence.add("8");
        sequence.add("4");

        Selector selector = sequence.selector();
        selector.printAll();

        verify(printStream).print("8 ");
        verify(printStream).print("4 ");
    }
}
