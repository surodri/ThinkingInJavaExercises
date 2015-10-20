package ReusingClassesChapter8;

import java.io.PrintStream;

public class Exercises extends Detergent {
    private final PrintStream printStream;

    public Exercises(PrintStream printStream) {

        this.printStream = printStream;
        printStream.println("Exercise constructor");
    }

    public void scrub(){

        printStream.println("Overriding Method From Inherited Class");
    }
}

