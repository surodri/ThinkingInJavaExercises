package polymorphism.music;

import org.junit.Test;

import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class WindTest {

    @Test
    public void playShouldCallPrintWithWindNoteMessage(){

        PrintStream printStream = mock(PrintStream.class);
        Wind flute = new Wind(printStream);

        flute.play(Note.MIDDLE_C);

        verify(printStream).println("Wind.play() MIDDLE_C");

    }


    @Test
    public void adjustShouldCallPrintWithAdjustingMessage(){

        PrintStream printStream = mock(PrintStream.class);
        Wind flute = new Wind(printStream);

        flute.adjust();

        verify(printStream).println("Adjusting Wind");

    }

    @Test
    public void whatShouldReturnTypeOfInstrument(){

        PrintStream printStream = mock(PrintStream.class);
        Wind flute = new Wind(printStream);

        String type = flute.what();

        assertThat(type).isEqualTo("Wind");

    }
}
