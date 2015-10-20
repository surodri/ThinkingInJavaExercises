package polymorphism.shape;


import java.io.PrintStream;

public class Triangle extends Shape {

    private final PrintStream printStream;

    public Triangle(PrintStream printStream) {
        super(printStream);
        this.printStream = printStream;
    }

    @Override
    public void draw() { printStream.println("Triangle.draw()"); }

    public void erase() { printStream.println("Triangle.erase()"); }

}