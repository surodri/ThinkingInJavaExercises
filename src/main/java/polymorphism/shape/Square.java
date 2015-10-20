package polymorphism.shape;

<<<<<<< HEAD
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
=======
public class Square extends Shape{
    public void draw() { System.out.println("Shape.draw()"); }

    public void erase() { System.out.println("Shape.erase()"); }
>>>>>>> 3aba159c4348c990e7154e2169e267508c343c0d
}
