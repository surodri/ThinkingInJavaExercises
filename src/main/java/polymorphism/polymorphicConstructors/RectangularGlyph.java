package polymorphism.polymorphicConstructors;

import java.io.PrintStream;

public class RectangularGlyph extends Glyph{
    private final int radius;
    private final PrintStream printStream;

    public RectangularGlyph(int radius, PrintStream printStream) {
        super(printStream);
        this.radius = radius;
        this.printStream = printStream;
        printStream.println("RectangularGlyph.RectangularGlyph(), radius = " + radius);
    }

    public void draw() {
        System.out.println("RectangularGlyph.draw(), radius = " + radius);
    }
}
