package polymorphism.meal;

import java.io.PrintStream;

public class Meal {


    private final PrintStream printStream;

    public Meal(PrintStream printStream) {

        this.printStream = printStream;
        printStream.println("Meal()");
    }
}
