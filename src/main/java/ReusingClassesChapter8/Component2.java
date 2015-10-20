package ReusingClassesChapter8;

import java.io.PrintStream;

public class Component2 {

    private final PrintStream printStream;

    public Component2(PrintStream printStream) {
        this.printStream = printStream;
        printStream.println("Component2 constructor");
    }

    public void dispose() {
        printStream.println("Component2 dispose");
    }
}
