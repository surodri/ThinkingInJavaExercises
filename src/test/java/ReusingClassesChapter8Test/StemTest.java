package reusingClassesChapter8Test;

import ReusingClassesChapter8.Stem;
import org.junit.Test;
import org.mockito.InOrder;

import java.io.PrintStream;

import static org.mockito.Mockito.inOrder;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class StemTest {

    @Test
    public void shouldCallPrintStreamWithConstructorMessage(){
        PrintStream printStream = mock(PrintStream.class);
        Stem steam = new Stem(printStream);

        verify(printStream).println("Stem constructor");
    }

    @Test
    public void shouldCallPrintStreamWithDisposeForEachInheritedClass(){
        PrintStream printStream = mock(PrintStream.class);
        Stem steam = new Stem(printStream);
        steam.dispose();


        InOrder inOrder = inOrder(printStream);
        inOrder.verify(printStream).println("Root constructor");
        inOrder.verify(printStream).println("Component1 constructor");
        inOrder.verify(printStream).println("Component2 constructor");
        inOrder.verify(printStream).println("Component3 constructor");
        inOrder.verify(printStream).println("Stem constructor");

        inOrder.verify(printStream).println("Component1 constructor");
        inOrder.verify(printStream).println("Component2 constructor");
        inOrder.verify(printStream).println("Component3 constructor");

        inOrder.verify(printStream).println("Stem dispose");
        inOrder.verify(printStream).println("Root dispose");
        inOrder.verify(printStream).println("Component1 dispose");
        inOrder.verify(printStream).println("Component2 dispose");
        inOrder.verify(printStream).println("Component3 dispose");
        inOrder.verify(printStream).println("Component1 dispose");
        inOrder.verify(printStream).println("Component2 dispose");
        inOrder.verify(printStream).println("Component3 dispose");

    }
}
