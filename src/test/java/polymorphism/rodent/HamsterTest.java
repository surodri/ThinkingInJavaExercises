package polymorphism.rodent;

import org.junit.Test;

import java.io.PrintStream;

import static org.mockito.Mockito.atLeastOnce;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class HamsterTest {

    @Test
    public void runCallsPrintWithHamsterMessage(){

        PrintStream printStream = mock(PrintStream.class);
        Hamster hamster = new Hamster(printStream);

        hamster.run();

        verify(printStream).println("Hamster running");
    }

    @Test
    public void attackCallsPrintWithHamsterMessage(){

        PrintStream printStream = mock(PrintStream.class);
        Hamster hamster = new Hamster(printStream);

        hamster.attack();

        verify(printStream).println("Hamster jelous attack");
    }

    @Test
    public void constructorCallsPrintWithHamsterCreation(){

        PrintStream printStream = mock(PrintStream.class);
        Hamster hamster = new Hamster(printStream);

        verify(printStream).println("Hamster()");
    }

    @Test
    public void constructorCallsPrintWithMemberObject(){
        PrintStream printStream = mock(PrintStream.class);
        Hamster hamster = new Hamster(printStream);

        verify(printStream, atLeastOnce()).println("MemberObject()");
    }


}
