package polymorphism.shape;

<<<<<<< HEAD
import java.io.PrintStream;
=======
>>>>>>> 3aba159c4348c990e7154e2169e267508c343c0d
import java.util.*;

public class RandomShapeGenerator {
    private Random rand = new Random(47);
<<<<<<< HEAD
    private PrintStream printStream;

    public RandomShapeGenerator(PrintStream printStream) {
        this.printStream = printStream;
    }
=======
>>>>>>> 3aba159c4348c990e7154e2169e267508c343c0d

    public Shape next() {

        switch(rand.nextInt(3)) {

            default:

<<<<<<< HEAD
            case 0: return new Circle(printStream);

            case 1: return new Square(printStream);

            case 2: return new Triangle(printStream);
=======
            case 0: return new Circle();

            case 1: return new Square();

            case 2: return new Triangle();
>>>>>>> 3aba159c4348c990e7154e2169e267508c343c0d

        }

    }
}
