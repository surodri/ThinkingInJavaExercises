package polymorphism.meal;

import java.io.PrintStream;

public class Cheese {
    private final PrintStream printStream;

    public Cheese(PrintStream printStream) {

        this.printStream = printStream;
        printStream.println("Cheese()");
    }
}
