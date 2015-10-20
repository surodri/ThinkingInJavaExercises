package polymorphism.shape;

import org.junit.Test;
import polymorphism.shape.Shape;

import java.io.PrintStream;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class ShapeTest {

    @Test
    public void ShouldCallPrintStreamWithUpcastedMessage() {


        PrintStream printStream = mock(PrintStream.class);
        Shape shape = new Shape(printStream);

        shape.erase();

        verify(printStream).println("New Method");
    }

}
