package polymorphism.polymorphicConstructors;

import org.junit.Test;

import java.io.PrintStream;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class RoundGlyphTest {

    @Test
    public void constructorInitializesRadius(){

        int radius = 2;
        PrintStream printStream = mock(PrintStream.class);
        RoundGlyph roundGlyph = new RoundGlyph(2, printStream);

        verify(printStream).println("RoundGlyph.RoundGlyph(), radius = " + radius);
    }


    @Test
    public void drawShouldCallPrintWithDrawMessage(){

        int radius = 2;
        PrintStream printStream = mock(PrintStream.class);
        RoundGlyph roundGlyph = new RoundGlyph(2, printStream);

        roundGlyph.draw();

        verify(printStream).println("RoundGlyph.draw(), radius = " + radius);
    }
}
