package reusingClassesChapter8Test;

import ReusingClassesChapter8.Component3;
import org.junit.Test;

import java.io.PrintStream;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class Component3Test {

    @Test
    public void shouldCallPrintStreamWithConstructorMessage(){

        PrintStream printStream = mock(PrintStream.class);
        Component3 component3 = new Component3(printStream);

        verify(printStream).println("Component3 constructor");
    }


    @Test
    public void shouldCallPrintStreamWithDisposeMessage(){

        PrintStream printStream = mock(PrintStream.class);
        Component3 component3 = new Component3(printStream);

        component3.dispose();

        verify(printStream).println("Component3 dispose");
    }

}
