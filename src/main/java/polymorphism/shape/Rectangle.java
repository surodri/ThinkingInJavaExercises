package polymorphism.shape;

import java.io.PrintStream;

public class Rectangle extends Shape{
    private final PrintStream printStream;

    public Rectangle(PrintStream printStream) {
        super(printStream);
        this.printStream = printStream;
    }

    @Override
    public void draw() { printStream.println("Rectangle.draw()"); }

    public void erase() { printStream.println("Rectangle.erase()"); }
}
