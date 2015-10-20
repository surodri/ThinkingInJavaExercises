package initializationAndCleanupChapter6;

import java.io.PrintStream;

public class Exercise14 {

    static String field1 = "I am initialized, Yay!";
    static String field2;

    private static PrintStream printStream;

    static{
        field2 = "I am initialized by static block";
    }

    public Exercise14(PrintStream printStream) {

        this.printStream = printStream;
    }

    public static void printInitiation() {
        printStream.println(field1);
        printStream.println(field2);
    }
}
