package polymorphism.referencecounting;

import java.io.PrintStream;

public class ReferenceCounting {

    private final PrintStream printStream;

    public ReferenceCounting(PrintStream printStream) {

        this.printStream = printStream;
    }

    public static void main(String[] args) {

        PrintStream printStream1 = System.out;
        Shared shared = new Shared(printStream1);
        Composing[] composing = { new Composing(shared, printStream1),
                new Composing(shared, printStream1), new Composing(shared, printStream1),
                new Composing(shared, printStream1), new Composing(shared, printStream1) };
        for(Composing c : composing)
            c.dispose();
    }

    public void finalize() {
        printStream.println("finalizing " + this);
    }
}
