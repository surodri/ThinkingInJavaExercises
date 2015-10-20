package reusingClassesChapter8Test;

import ReusingClassesChapter8.Component1;
import org.junit.Test;

import java.io.PrintStream;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class Component1Test {



    @Test
    public void shouldCallPrintStreamWithConstructorMessage(){
        PrintStream printStream = mock(PrintStream.class);
        Component1 component1 = new Component1(printStream);

        verify(printStream).println("Component1 constructor");
    }


    @Test
    public void shouldCallPrintStreamWithDisposeMessage(){
        PrintStream printStream = mock(PrintStream.class);
        Component1 component1 = new Component1(printStream);
        component1.dispose();

        verify(printStream).println("Component1 dispose");
    }
}
