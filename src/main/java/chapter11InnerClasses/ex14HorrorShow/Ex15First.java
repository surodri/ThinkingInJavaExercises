package chapter11InnerClasses.ex14HorrorShow;

import java.io.PrintStream;

public class Ex15First {

    private final PrintStream printStream;

    public Ex15First(PrintStream printStream) {
        this.printStream = printStream;
        printStream.println("This is EX15()"); 
    }
}
