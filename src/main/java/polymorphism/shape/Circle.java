package polymorphism.shape;

<<<<<<< HEAD
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
=======
public class Circle extends Shape{
    public void draw() { System.out.println("Circle.draw()"); }

    public void erase() { System.out.println("Circle.erase()"); }
>>>>>>> 3aba159c4348c990e7154e2169e267508c343c0d
}
