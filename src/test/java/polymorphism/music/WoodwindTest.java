package polymorphism.music;

import org.junit.Before;
import org.junit.Test;

import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class WoodwindTest {

    PrintStream printStream;
    @Before
    public void setUp(){
        printStream = mock(PrintStream.class);
    }

    @Test
    public void playShouldPrintWithWoodwindMessageUsingUpcasting(){

        Wind woodwind = new Woodwind(printStream);

        woodwind.play(Note.MIDDLE_C);

        verify(printStream).println("Woodwind.play() MIDDLE_C");
    }

    @Test
    public void whatShouldCallPrintWithAdjustMessage(){

        Woodwind woodwind = new Woodwind(printStream);

        String type = woodwind.what();

        assertThat(type).isEqualTo("Woodwind");
    }



}
