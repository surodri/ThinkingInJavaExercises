package interfacesChapter10.factoryPatternEx18_19;

import java.io.PrintStream;

public class TricycleImpl implements Cycle {
    private final PrintStream printStream;

    public TricycleImpl(PrintStream printStream) {
        this.printStream = printStream;
        printStream.println("Tricycle created");
    }

    public void drive(Cycle cycle) {
        cycle.ride();
    }

    @Override
    public void ride() {
    }

    @Override
    public int wheels() {
        return 0;
    }
}
