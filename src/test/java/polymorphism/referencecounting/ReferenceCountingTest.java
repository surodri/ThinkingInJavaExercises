package polymorphism.referencecounting;

import org.junit.Test;

import java.io.PrintStream;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class ReferenceCountingTest {


    @Test
    public void disposeShouldPrintMessageFor(){
        PrintStream printStream = mock(PrintStream.class);
        ReferenceCounting referenceCounting = new ReferenceCounting(printStream);

        referenceCounting.finalize();

        verify(printStream).println("finalizing " + referenceCounting);

    }
}
