package polymorphism.referencecounting;

import java.io.PrintStream;

public class Shared {

    private final PrintStream printStream;
    public int refcount = 0;
    private static long counter = 0;
    private final long id = counter++;

    public Shared(PrintStream printStream) {
        this.printStream = printStream;
        printStream.println("Creating " + this);
    }

    public void addRef() { refcount++; }

    public void dispose() {
        if(--refcount == 0)
            printStream.println("Disposing " + this);
    }
    public String toString() { return "Shared " + id; }
}
