package polymorphism;

import java.io.PrintStream;

public class Cycle {
    private final PrintStream printStream;

    public Cycle(PrintStream printStream) {

        this.printStream = printStream;
    }

    public void ride() {
        printStream.println("Upcasted");

        int numberOfWheels = wheels();
        printStream.println("Number of wheels "+numberOfWheels);
    }

    public int wheels() {
        return 0;
    }
}
