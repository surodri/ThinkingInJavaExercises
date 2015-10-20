package polymorphism.meal;

import java.io.PrintStream;

public class Lettuce {
    private final PrintStream printStream;

    public Lettuce(PrintStream printStream) {
        this.printStream = printStream;
        printStream.println("Lettuce()");
    }
}
