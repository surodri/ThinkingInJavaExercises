package ReusingClassesChapter8;

import java.io.PrintStream;

public class OverloadedMethodsBase {

    private final PrintStream printStream;

    public OverloadedMethodsBase(PrintStream printStream) {

        this.printStream = printStream;
    }


    public void method1(int intParam) {
        printStream.println(intParam);

    }


}
