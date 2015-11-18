package holdingYourObjects;

import java.io.PrintStream;

/**
 * Created by srodriguez on 11/12/15.
 */
public class Dog implements Pet {
    private PrintStream printStream;

    public Dog(PrintStream printStream) {
        this.printStream = printStream;
        printStream.print("Dog ");
    }
}
