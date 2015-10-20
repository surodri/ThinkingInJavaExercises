package polymorphism.shape;

import java.io.PrintStream;

public class Square extends Shape{
    private final PrintStream printStream;

    public Square(PrintStream printStream) {
        super(printStream);
        this.printStream = printStream;
    }

    @Override
    public void draw() { printStream.println("Square.draw()"); }

    @Override
    public void erase() { printStream.println("Shape.erase()"); }
}
