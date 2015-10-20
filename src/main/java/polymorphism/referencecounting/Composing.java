package polymorphism.referencecounting;

import java.io.PrintStream;

public class Composing {
    private final Shared shared;
    private final PrintStream printStream;

    public Composing(Shared shared, PrintStream printStream) {
        this.shared = shared;
        this.printStream = printStream;
        printStream.println("Creating " + this);

    }

    public void dispose() {
        printStream.println("disposing " + this);
        shared.dispose();
    }
}
