package polymorphism.cycle;

import java.io.PrintStream;

public class Tricycle extends Cycle {
    private final PrintStream printStream;

    public Tricycle(PrintStream printStream) {
        super(printStream);
        this.printStream = printStream;
    }

    public void drive(Cycle cycle) {
        cycle.ride();
    }
}
