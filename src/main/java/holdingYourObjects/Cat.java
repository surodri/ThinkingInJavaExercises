package holdingYourObjects;

import java.io.PrintStream;

/**
 * Created by srodriguez on 11/12/15.
 */
public class Cat implements Pet{
    private PrintStream printStream;

    public Cat(PrintStream printStream) {

        this.printStream = printStream;
        printStream.println("Cat ");
    }
}
