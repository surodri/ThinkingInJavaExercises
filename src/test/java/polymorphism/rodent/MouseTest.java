package polymorphism.rodent;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InOrder;
import polymorphism.referencecounting.Shared;

import java.io.PrintStream;

import static org.mockito.Mockito.inOrder;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class MouseTest {

    Shared shared;

    @Before
    public void setUp(){
        shared = mock(Shared.class);

    }

    @Test
    public void eatShouldCallPrintWithMouseEating(){

        PrintStream printStream = mock(PrintStream.class);
        Mouse mouse = new Mouse(printStream, shared);

        mouse.run();

        verify(printStream).println("Mouse Running");
    }

    @Test
    public void attackCallsPrintWithRodentAttack(){
        PrintStream printStream = mock(PrintStream.class);
        Mouse mouse = new Mouse(printStream, shared);

        mouse.attack();

        verify(printStream).println("Mouse to scared to attack");
    }

    @Test
    public void constructoCallsPrintWithMouseCreation(){
        PrintStream printStream = mock(PrintStream.class);
        Mouse mouse = new Mouse(printStream, shared);

        verify(printStream).println("Mouse()");
    }

    @Test
    public void constructorCallsPrintWithMemberObject(){
        PrintStream printStream = mock(PrintStream.class);
        Mouse mouse = new Mouse(printStream, shared);

        InOrder inOrder = inOrder(printStream);

        inOrder.verify(printStream).println("MemberObject()");
        inOrder.verify(printStream).println("MemberObject()");

    }

    @Test
    public void incrementSharedCallsAddRef(){
        PrintStream printStream = mock(PrintStream.class);
        Mouse mouse = new Mouse(printStream, shared);

        mouse.incrementShared();

        verify(shared).addRef();
    }
}
