package ReusingClassesChapter8;

import java.io.PrintStream;

/**
 * Created by Thoughtworker on 9/29/15.
 */
public class OverloadedMethodsBase {

    private final PrintStream printStream;

    public OverloadedMethodsBase(PrintStream printStream) {

        this.printStream = printStream;
    }


    public void method1(int intParam) {
        printStream.println(intParam);

    }


}
