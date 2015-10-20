package polymorphism.polymorphicConstructors;

import java.io.PrintStream;

public class RoundGlyph extends Glyph{
    private final int radius;
    private final PrintStream printStream;

    public RoundGlyph(int radius, PrintStream printStream) {
        super(printStream);
        this.radius = radius;
        this.printStream = printStream;
        printStream.println("RoundGlyph.RoundGlyph(), radius = " + radius);
    }

    protected void draw() {
        System.out.println("RoundGlyph.draw(), radius = " + radius);
    }
}
