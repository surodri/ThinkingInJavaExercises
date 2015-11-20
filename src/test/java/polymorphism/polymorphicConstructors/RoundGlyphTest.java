package polymorphism.polymorphicConstructors;

import org.junit.Test;

import java.io.PrintStream;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.internal.verification.VerificationModeFactory.atLeastOnce;

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

        verify(printStream, atLeastOnce()).println("RoundGlyph.draw(), radius = " + radius);
    }
}
