package reusingClassesChapter8Test;

import ReusingClassesChapter8.Component2;
import org.junit.Test;

import java.io.PrintStream;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class Component2Test {


    @Test
    public void shouldCallPrintStreamWithConstructorMessage(){
        PrintStream printStream = mock(PrintStream.class);
        Component2 component2 = new Component2(printStream);

        verify(printStream).println("Component2 constructor");
    }

    @Test
    public void shouldCallPrintStreamWithDisposeMessage(){
        PrintStream printStream = mock(PrintStream.class);
        Component2 component2 = new Component2(printStream);

        component2.dispose();

        verify(printStream).println("Component2 dispose");
    }
}


