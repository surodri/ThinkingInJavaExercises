package polymorphism.referencecounting;

import org.junit.Test;

import java.io.PrintStream;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class ComposingTest {


    @Test
    public void constructorCallsPrintWithCreatingMessage(){
        PrintStream printStream = mock(PrintStream.class);
        Shared shared = mock(Shared.class);
        Composing composing = new Composing(shared, printStream);

        verify(printStream).println("Creating " + composing);
    }

    @Test
    public void disposeCallsPrintWithMemberObject(){
        PrintStream printStream = mock(PrintStream.class);
        Shared shared = mock(Shared.class);
        Composing composing = new Composing(shared, printStream);

        composing.dispose();

        verify(printStream).println("disposing " + composing);
    }
}

