package polymorphism.transmography;


import java.io.PrintStream;

public class RedAlert extends Alert {
    private PrintStream printStream;

    public RedAlert(PrintStream printStream) {
        this.printStream = printStream;
    }

    public void broadCast() { printStream.println("Red zone"); }
}
