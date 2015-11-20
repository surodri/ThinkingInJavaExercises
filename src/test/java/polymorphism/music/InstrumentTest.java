package polymorphism.music;

import org.junit.Test;

import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class InstrumentTest {

    @Test
    public void playShouldCallPrintWithWindNoteMessage(){

        PrintStream printStream = mock(PrintStream.class);
        Instrument instrument = new Instrument(printStream);

        instrument.play(Note.MIDDLE_C);

        verify(printStream).println("Instrument.play() MIDDLE_C");

    }

    @Test
    public void whatShouldReturnTypeOfInstrument(){

        PrintStream printStream = mock(PrintStream.class);
        Instrument instrument = new Instrument(printStream);

        String type = instrument.toString();

        assertThat(type).isEqualTo("Instrument");

    }

}
