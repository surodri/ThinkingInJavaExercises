package initializationAndCleanupChapter6;

import java.io.PrintStream;
public class CupExc13 {
    private PrintStream printStream;

    public CupExc13(int marker, PrintStream printStream) {
        this.printStream = printStream;
        printStream.println("Cup(" + marker + ")");

    }

    public void f(int maker) {
        printStream.println("f(" + maker + ")");
    }

}
