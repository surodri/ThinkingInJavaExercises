package ReusingClassesChapter8;

import java.io.PrintStream;

public class B {
    public B(PrintStream printStream){

        System.out.println("C class is announcing itself");
        printStream.println("B constructor");
    }
}
