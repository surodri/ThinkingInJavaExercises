package ReusingClassesChapter8;

import java.io.PrintStream;

/**
 * Created by Thoughtworker on 9/29/15.
 */
public class OverloadedMethods extends OverloadedMethodsBase {
    private final PrintStream printStream;

    public OverloadedMethods(PrintStream printStream) {
        super(printStream);

        this.printStream = printStream;
    }

    public void method1(String message) {
        printStream.println(message);

    }
}
