package polymorphism.shape;

import java.io.PrintStream;
import java.util.*;

public class RandomShapeGenerator {
    private Random rand = new Random(47);
    private PrintStream printStream;

    public RandomShapeGenerator(PrintStream printStream) {
        this.printStream = printStream;
    }

    public Shape next() {

        switch(rand.nextInt(3)) {

            default:

            case 0: return new Circle(printStream);

            case 1: return new Square(printStream);

            case 2: return new Triangle(printStream);

        }

    }
}
