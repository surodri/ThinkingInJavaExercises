package polymorphism.music;

import org.junit.Before;
import org.junit.Test;

import java.io.PrintStream;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class BrassTest {

    PrintStream printStream;
    @Before
    public void setUp(){
        printStream = mock(PrintStream.class);
    }

    @Test
    public void playShouldPrintWithBrassMessageUsingUpcasting(){

        Wind brass = new Brass(printStream);

        brass.play(Note.MIDDLE_C);

        verify(printStream).println("Brass.play() MIDDLE_C");
    }

    @Test
    public void adjustShouldCallPrintWithAdjustMessage(){

        Wind brass = new Brass(printStream);

        brass.adjust();

        verify(printStream).println("Adjusting Brass");
    }

}
