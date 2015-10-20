package polymorphism.music;

import org.junit.Test;

import java.io.PrintStream;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class MusicTest {

    //lets me change stuff in
    @Test
    public void tuneShouldCallPlayMethodForWind(){
        Music music = new Music();
        Wind flute = mock(Wind.class);

        music.tune(flute);

        verify(flute).play(Note.MIDDLE_C);
    }

    //behavior oriented test
    //if you do change something in flute
    //if you change something in Wind you have to change something in this test as well
    //more expensive to mantain
    @Test
    public void tuneShouldCallPrintStatementFromWindClass(){
        //Integrational test
        PrintStream printStream = mock(PrintStream.class);
        Music music = new Music();

        Wind flute = new Wind(printStream);
        music.tune(flute);

        verify(printStream).println("Wind.play() MIDDLE_C");
    }

}
