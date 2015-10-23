package polymorphism.cycle;

import java.io.PrintStream;

public class Bicycle extends Cycle{
    private final PrintStream printStream;

    public Bicycle(PrintStream printStream) {
        super(printStream);
        this.printStream = printStream;
    }


    public void drive(Cycle cycle){
        cycle.ride();
    }

}
