package polymorphism.meal;

import org.junit.Test;

import java.io.PrintStream;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class PortableLunchTest {


    @Test
    public void constructorCallsPrintWithSelfMessage() {
        PrintStream printStream = mock(PrintStream.class);
        PortableLunch portableLunch = new PortableLunch(printStream);

        verify(printStream).println("PortableLunch()");
    }


}
