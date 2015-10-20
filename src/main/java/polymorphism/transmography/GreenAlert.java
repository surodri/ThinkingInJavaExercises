package polymorphism.transmography;

import java.io.PrintStream;

public class GreenAlert extends Alert {

    private final PrintStream printStream;

    public GreenAlert(PrintStream printStream) {
        this.printStream = printStream;
    }

    public void broadCast() { printStream.println("Green Zone"); }
}
