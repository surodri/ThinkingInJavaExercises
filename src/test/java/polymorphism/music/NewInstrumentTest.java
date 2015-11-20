package polymorphism.music;

import org.junit.Test;

import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class NewInstrumentTest {


        @Test
        public void playShouldCallPrintWithNewInstrumentNoteMessage(){

            PrintStream printStream = mock(PrintStream.class);
            NewInstrument newInstrumentType = new NewInstrument(printStream);

            newInstrumentType.play(Note.MIDDLE_C);

            verify(printStream).println("NewInstrument.play() MIDDLE_C");
        }

        @Test
        public void adjustShouldCallPrintAdjustingMessage(){
            PrintStream printStream = mock(PrintStream.class);
            NewInstrument newInstrument = new NewInstrument(printStream);

            newInstrument.adjust();

            verify(printStream).println("Adjusting NewInstrument");

        }

        @Test
        public void adjustShouldPrintAdjustingMessageUsingUpcasting(){
            PrintStream printStream = mock(PrintStream.class);
            Instrument newInstrument = new NewInstrument(printStream);

            newInstrument.adjust();

            verify(printStream).println("Adjusting NewInstrument");
        }

        @Test
        public void whatShouldReturnTypeInstrumentUsingPrintln(){

            PrintStream printStream = mock(PrintStream.class);
            Instrument newInstrument = new NewInstrument(printStream);

            String type = newInstrument.toString();

            assertThat(type).isEqualTo("NewInstrument");
        }
}

