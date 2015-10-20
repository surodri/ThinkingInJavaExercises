package polymorphism.shape;

<<<<<<< HEAD
import java.io.PrintStream;

public class Shape {

    private final PrintStream printStream;

    public Shape(PrintStream printStream) {

        this.printStream = printStream;
    }

    public void draw() {}

    public void erase() {
        printStream.println("New Method");
    }
=======
public class Shape {

    public void draw() {}

    public void erase() {}
>>>>>>> 3aba159c4348c990e7154e2169e267508c343c0d

}