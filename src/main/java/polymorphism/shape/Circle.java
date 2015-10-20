package polymorphism.shape;

import java.io.PrintStream;

public class Circle extends Shape{

    private final PrintStream printStream;

    public Circle(PrintStream printStream) {
        super(printStream);
        this.printStream = printStream;
    }

    @Override
    public void draw() { printStream.println("Circle.draw()"); }

    public void erase() { printStream.println("Circle.erase()"); }
}
