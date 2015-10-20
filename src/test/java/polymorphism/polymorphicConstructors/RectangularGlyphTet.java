package polymorphism.polymorphicConstructors;

import org.junit.Test;

import java.io.PrintStream;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class RectangularGlyphTet {

    @Test
    public void constructorInitializesRadius(){

        int radius = 2;
        PrintStream printStream = mock(PrintStream.class);
        RectangularGlyph rectangularGlyph = new RectangularGlyph(2, printStream);

        verify(printStream).println("RectangularGlyph.RectangularGlyph(), radius = " + radius);
    }


    @Test
    public void drawShouldCallPrintWithDrawMessage(){

        int radius = 2;
        PrintStream printStream = mock(PrintStream.class);
        RectangularGlyph rectangularGlyph = new RectangularGlyph(2, printStream);

        rectangularGlyph.draw();

        verify(printStream).println("RectangularGlyph.draw(), radius = " + radius);
    }

}
