package ReusingClassesChapter8;

import java.io.PrintStream;

public class Exercise4 extends Cartoon {
    public Exercise4(PrintStream printStream) {
        super(printStream);
        printStream.println("Exercise4 constructor");
    }

    public static void main(String[] args){
        PrintStream printStream= new PrintStream(System.out);
        Exercise4 cartoon = new Exercise4(printStream);
    }
}
