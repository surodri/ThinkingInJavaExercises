package reusingClassesChapter8Test;

import ReusingClassesChapter8.Root;
import org.junit.Test;

import java.io.PrintStream;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class RootTest {


    @Test
    public void shouldCallPrintStreamWithConstructorMessage(){
        PrintStream printStream = mock(PrintStream.class);
        Root root = new Root(printStream);

        verify(printStream).println("Root constructor");
    }

    @Test
    public void shouldCallPrintStreamWithDisposeMessage(){
        PrintStream printStream = mock(PrintStream.class);
        Root root = new Root(printStream);
        root.dispose();

        verify(printStream).println("Root dispose");
    }
}
