package polymorphism.music;

import interfacesChapter10.music.*;
import interfacesChapter10.music.Brass;
import interfacesChapter10.music.Wind;
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

        interfacesChapter10.music.Wind brass = new interfacesChapter10.music.Brass(printStream);

        brass.play(interfacesChapter10.music.Note.MIDDLE_C);

        verify(printStream).println("Brass.play() MIDDLE_C");
    }

    @Test
    public void adjustShouldCallPrintWithAdjustMessage(){

        Wind brass = new Brass(printStream);

        brass.adjust();

        verify(printStream).println("Adjusting Brass");
    }

}
