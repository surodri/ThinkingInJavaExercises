package ReusingClassesChapter8;

import java.io.PrintStream;

public class Component3 {

    private final PrintStream printStream;

    public Component3(PrintStream printStream) {
        this.printStream = printStream;
        printStream.println("Component3 constructor");
    }

    public void dispose() {
        printStream.println("Component3 dispose");
    }
}
