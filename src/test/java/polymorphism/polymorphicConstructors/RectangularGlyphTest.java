package polymorphism.polymorphicConstructors;

import org.junit.Test;

import java.io.PrintStream;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.internal.verification.VerificationModeFactory.atLeastOnce;

public class RectangularGlyphTest {

    @Test
    public void constructorInitializesRadius(){

        int radius = 2;
        PrintStream printStream = mock(PrintStream.class);
        RectangularGlyph rectangularGlyph = new RectangularGlyph(2, printStream);

        verify(printStream).println("RectangularGlyph.RectangularGlyph(), radius = " + radius);
    }

    //NOTE: Method expected not to pass when uncomenting verifications
    @Test
    public void drawShouldCallPrintWithDrawMessage(){

        int radius = 2;
        PrintStream printStream = mock(PrintStream.class);
        RectangularGlyph rectangularGlyph = new RectangularGlyph(2, System.out);

        rectangularGlyph.draw();

        //NOTE: expect verifications not to pass, because Glyph has
        verify(printStream, atLeastOnce()).print("RectangularGlyph.draw(), radius = " + radius);
    }

}
