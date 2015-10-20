package polymorphism.polymorphicConstructors;

import org.junit.Test;
import org.mockito.InOrder;

import java.io.PrintStream;

import static org.mockito.Mockito.inOrder;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockingDetails;

public class GlyphTest {

    @Test
    public void constructorCallsPrintThreeTimesWithDraw(){

        PrintStream printStream = mock(PrintStream.class);
        Glyph glyph = new Glyph(printStream);

        InOrder inOrder = inOrder(printStream);

        inOrder.verify(printStream).println("Glyph() before draw()");
        inOrder.verify(printStream).println("Glyph.draw()");
        inOrder.verify(printStream).println("Glyph() after draw()");
    }
}
