package polymorphism.music;

import org.junit.Test;

import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class StringedTest {


    @Test
    public void playShouldPrintWithStringedMessageUsingUpcasting(){

        PrintStream printStream = mock(PrintStream.class);
        Instrument stringed = new Stringed(printStream);

        stringed.play(Note.MIDDLE_C);

        verify(printStream).println("Stringed.play() MIDDLE_C");
    }

    @Test
    public void adjustShouldCallPrintAdjustingMessage(){
        PrintStream printStream = mock(PrintStream.class);
        Stringed stringed = new Stringed(printStream);

        stringed.adjust();

        verify(printStream).println("Adjusting Stringed");

    }


    @Test
    public void whatShouldReturnTypeInstrument(){

        PrintStream printStream = mock(PrintStream.class);
        Stringed Stringed = new Stringed(printStream);

        String type = Stringed.what();

        assertThat(type).isEqualTo("Stringed");
    }

}
