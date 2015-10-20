package ReusingClassesChapter8;

import java.io.PrintStream;

public class C {

    private final PrintStream printStream;
    B classB  ;

    public C(PrintStream printStream) {
        this.printStream = printStream;
        this.classB = new B(printStream);
    }

    public static void main(String []args){
        PrintStream printStreamUsed = new PrintStream(System.out);
        C classC = new C(printStreamUsed);
    }
}
