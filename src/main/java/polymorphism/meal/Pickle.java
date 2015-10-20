package polymorphism.meal;

import java.io.PrintStream;

public class Pickle {
    private final PrintStream printStream;

    public Pickle(PrintStream printStream) {

        this.printStream = printStream;
        printStream.println("Pickle()");
    }
}
