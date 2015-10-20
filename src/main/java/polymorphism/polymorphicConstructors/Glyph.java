package polymorphism.polymorphicConstructors;

import java.io.PrintStream;

public class Glyph {
    private final PrintStream printStream;

    public Glyph(PrintStream printStream) {
        this.printStream = printStream;
        printStream.println("Glyph() before draw()");
        draw();
        printStream.println("Glyph() after draw()");
    }

    protected void draw() {
        printStream.println("Glyph.draw()");
    }
}
