package polymorphism;

import java.io.PrintStream;

public class Unicycle extends Cycle{
    private final PrintStream printStream;

    public Unicycle(PrintStream printStream) {
        super(printStream);
        this.printStream = printStream;
    }

    public void drive(Cycle cycle){
        cycle.ride();
    }
}
