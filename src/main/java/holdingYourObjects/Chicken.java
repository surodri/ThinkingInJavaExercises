package holdingYourObjects;

import java.io.PrintStream;

/**
 * Created by srodriguez on 11/12/15.
 */
public class Chicken implements Pet {
    private PrintStream printStream;

    public Chicken(PrintStream printStream) {

        this.printStream = printStream;
        printStream.print("Chicken ");
    }
}
