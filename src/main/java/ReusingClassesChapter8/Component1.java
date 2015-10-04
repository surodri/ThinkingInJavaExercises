package ReusingClassesChapter8;

import java.io.PrintStream;

public class Component1 {

    private final PrintStream printStream;

    public Component1(PrintStream printStream) {
        this.printStream = printStream;
        this.printStream.println("Component1 constructor");
    }

    public void dispose() {
        printStream.println("Component1 dispose");
    }
}
