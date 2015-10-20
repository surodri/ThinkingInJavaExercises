package polymorphism;

import java.io.PrintStream;

public class BaseExc10 {
    private final PrintStream printStream;

    public BaseExc10(PrintStream printStream) {
        this.printStream = printStream;
    }

    public void method1() {
        method2();
    }

    protected void method2() {
        printStream.println("method2()");
    }
}
