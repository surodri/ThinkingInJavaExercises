package polymorphism.meal;

import java.io.PrintStream;

public class Lunch extends Meal{
    private final PrintStream printStream;

    public Lunch(PrintStream printStream) {
        super(printStream);
        this.printStream = printStream;
        printStream.println("Lunch()");
    }
}
