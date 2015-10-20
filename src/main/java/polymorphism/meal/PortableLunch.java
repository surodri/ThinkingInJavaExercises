package polymorphism.meal;

import java.io.PrintStream;

public class PortableLunch extends Lunch {
    private final PrintStream printStream;

    public PortableLunch(PrintStream printStream) {
        super(printStream);
        this.printStream = printStream;
        printStream.println("PortableLunch()");
    }
}
