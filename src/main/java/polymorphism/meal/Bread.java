package polymorphism.meal;

import java.io.PrintStream;

public class Bread {
    private final PrintStream printStream;

    public Bread(PrintStream printStream) {

        this.printStream = printStream;
        printStream.println("Bread()");
    }
}
