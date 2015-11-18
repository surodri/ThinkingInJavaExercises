package holdingYourObjects;

import java.io.PrintStream;

/**
 * Created by srodriguez on 11/12/15.
 */
public class Hamster implements Pet {
    private PrintStream printStream;

    public Hamster(PrintStream printStream) {

        this.printStream = printStream;
        printStream.print("Hamster ");
    }
}
