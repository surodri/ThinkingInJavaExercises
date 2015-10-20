package polymorphism.meal;

import org.junit.Test;

import java.io.PrintStream;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class BreadTest {


    @Test
    public void constructorCallsPrintWithSelfMessage(){
        PrintStream printStream = mock(PrintStream.class);
        Bread bread = new Bread(printStream);

        verify(printStream).println("Bread()");
    }
}
