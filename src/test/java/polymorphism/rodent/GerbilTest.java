package polymorphism.rodent;

import org.junit.Test;

import java.io.PrintStream;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class GerbilTest {

    @Test
    public void runCallsPrintWithGerbilMessage(){
        PrintStream printStream = mock(PrintStream.class);
        Gerbil gerbil = new Gerbil(printStream);

        gerbil.run();

        verify(printStream).println("Gerbil running fast");
    }

    @Test
    public void attackCallsPrintWithRodentMessage(){
        PrintStream printStream = mock(PrintStream.class);
        Gerbil gerbil = new Gerbil(printStream);

        gerbil.attack();

        verify(printStream).println("Gerbil scary attack");
    }

    @Test
    public void constructorCallsPrintWithGerbilSelfMessage(){
        PrintStream printStream = mock(PrintStream.class);
        Gerbil gerbil = new Gerbil(printStream);

        verify(printStream).println("Gerbil()");
    }

    @Test
    public void construtorCallsPrintWithMemberObject(){
        PrintStream printStream = mock(PrintStream.class);
        Gerbil gerbil = new Gerbil(printStream);

        verify(printStream).println("MemberObject()");
    }
}

