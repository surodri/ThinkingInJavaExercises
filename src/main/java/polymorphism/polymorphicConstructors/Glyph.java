package polymorphism.polymorphicConstructors;

import java.io.PrintStream;

public class Glyph {
    private PrintStream printStream = null;

    public Glyph(PrintStream printStream) {
        this.printStream = printStream;
        this.printStream.println("Glyph() before draw()");
        this.draw();
        this.printStream.println("Glyph() after draw()");
    }

    public void draw() {
        printStream.println("Glyph.draw()");
    }
}
