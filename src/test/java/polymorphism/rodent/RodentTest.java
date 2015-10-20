package polymorphism.rodent;

import org.junit.Test;
import org.mockito.InOrder;

import java.io.PrintStream;

import static org.mockito.Mockito.inOrder;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class RodentTest {

    @Test
    public void runCallsPrintWithRodentMessage(){

        PrintStream printStream = mock(PrintStream.class);
        Rodent rodent = new Rodent(printStream);

        rodent.run();

        verify(printStream).println("Rodent Running");
    }

    @Test
    public void attackCallsPrintWithRodentMessage(){
        PrintStream printStream = mock(PrintStream.class);
        Rodent rodent = new Rodent(printStream);

        rodent.attack();

        verify(printStream).println("Rodent could attack");
    }

    @Test
    public void constructoCallsPrintWithMouseCreation(){
        PrintStream printStream = mock(PrintStream.class);
        Rodent rodent = new Rodent(printStream);

        verify(printStream).println("Rodent()");
    }


    @Test
    public void constructorCallsPrintWithMemberObject(){
        PrintStream printStream = mock(PrintStream.class);
        Rodent Rodent = new Rodent(printStream);

        //this is because
        verify(printStream).println("MemberObject()");
    }
}
