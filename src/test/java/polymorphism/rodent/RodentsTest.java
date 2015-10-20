package polymorphism.rodent;

import org.junit.Test;

import java.io.PrintStream;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class RodentsTest {

    //its ok to test both at the
    @Test
    public void allBehaviorsCallsRunForMouse(){
        Mouse mouse = mock(Mouse.class);
        Gerbil gerbil = mock(Gerbil.class);
        Hamster hamster = mock(Hamster.class);
        Rodent[] allRodents = {
                mouse,
                gerbil,
                hamster
        };
        PrintStream printStream = mock(PrintStream.class);
        Rodents rodents = new Rodents(printStream);

        rodents.allBehaviors(allRodents);

        verify(mouse).run();
        verify(mouse).attack();

        verify(gerbil).run();
        verify(gerbil).attack();

        verify(hamster).run();
        verify(hamster).attack();
    }

    @Test
    public void allBehaviorsCallsRunForGerbil(){
        Gerbil gerbil = mock(Gerbil.class);
        Rodent[] allRodents = {
                gerbil,
        };
        PrintStream printStream = mock(PrintStream.class);
        Rodents rodents = new Rodents(printStream);

        rodents.allBehaviors(allRodents);

        verify(gerbil).run();
        verify(gerbil).attack();
    }

    @Test
    public void allBehaviorsCallsRunForHampster(){
        Hamster hamster = mock(Hamster.class);
        Rodent[] allRodents = {
                hamster
        };
        PrintStream printStream = mock(PrintStream.class);
        Rodents rodents = new Rodents(printStream);

        rodents.allBehaviors(allRodents);

        verify(hamster).run();
        verify(hamster).attack();
    }
}
