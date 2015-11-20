package polymorphism.polymorphicConstructors;

import java.io.PrintStream;

public class RectangularGlyph extends Glyph{
    private int radius = 0;
    private PrintStream printStream = null;

    public RectangularGlyph(int radius, PrintStream printStream) {
        super(printStream);
        this.radius = radius;
        this.printStream = printStream;
        printStream.println("RectangularGlyph.RectangularGlyph(), radius = " + this.radius);
    }

    public void draw() {
        System.out.println("RectangularGlyph.draw(), radius = " + radius);
    }
}
