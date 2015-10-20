package polymorphism.music;

import org.junit.Test;

import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class PercussionTest {

    @Test
    public void playShouldCallPrintWithPercussionNoteMessage(){

        PrintStream printStream = mock(PrintStream.class);
        Percussion percussion = new Percussion(printStream);

        percussion.play(Note.MIDDLE_C);

        verify(printStream).println("Percussion.play() MIDDLE_C");
    }


    @Test
    public void adjustShouldCallPrintWithAdjustingMessage(){

        PrintStream printStream = mock(PrintStream.class);
        Percussion percussion = new Percussion(printStream);

        percussion.adjust();

        verify(printStream).println("Adjusting Percussion");

    }

    @Test
    public void whatShouldReturnTypeOfInstrument(){

        PrintStream printStream = mock(PrintStream.class);
        Percussion percussion = new Percussion(printStream);

        String type = percussion.what();

        assertThat(type).isEqualTo("Percussion");

    }

}
