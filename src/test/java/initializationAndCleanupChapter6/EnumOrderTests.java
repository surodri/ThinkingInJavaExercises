package initializationAndCleanupChapter6;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InOrder;

import java.io.PrintStream;

import static org.mockito.Mockito.inOrder;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class EnumOrderTests {

    PrintStream printStream;
    EnumOrder enumOrder;

    @Before
    public void setUp() throws Exception {
        printStream = mock(PrintStream.class);
        enumOrder = new EnumOrder(printStream);
    }

    @Test
    public void printEnumsExercise21ShoulPrintEachEnumWithItsOrdinal(){

        enumOrder.printEnumsExercise21();

        InOrder inOrder = inOrder(printStream);
        inOrder.verify(printStream).println("DOLLAR, ordinal 0");
        inOrder.verify(printStream).println("PESO, ordinal 1");
        inOrder.verify(printStream).println("EURO, ordinal 2");
        inOrder.verify(printStream).println("YANG, ordinal 3");
        inOrder.verify(printStream).println("COIN, ordinal 4");
        inOrder.verify(printStream).println("CANADIAN, ordinal 5");
    }

    @Test
    public void describeExercise22CallsPrintlnDescriptionGivenCanadianCurrency(){

        enumOrder.describeExercise22(PaperCurrency.CANADIAN);

        verify(printStream).println("Currency from Cade's land");
    }

    @Test
    public void describeExercise22CallsPrintlnDescriptionGivenPesoCurrency(){

        enumOrder.describeExercise22(PaperCurrency.PESO);

        verify(printStream).println("Currency from Susana's land");
    }

}
