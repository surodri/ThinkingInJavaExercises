package interfacesChapter10.factoryPatternEx18_19;

import java.io.PrintStream;

public class BicycleImpl implements Cycle {
    private final PrintStream printStream;

    public BicycleImpl(PrintStream printStream) {
        this.printStream = printStream;
        printStream.println("Bicycle Created");
    }


    public void drive(Cycle cycle){
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
