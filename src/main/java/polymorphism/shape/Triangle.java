package polymorphism.shape;


<<<<<<< HEAD
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
=======
public class Triangle extends Shape {

    public void draw() { System.out.println("Triangle.draw()"); }

    public void erase() { System.out.println("Triangle.erase()"); }
>>>>>>> 3aba159c4348c990e7154e2169e267508c343c0d

}