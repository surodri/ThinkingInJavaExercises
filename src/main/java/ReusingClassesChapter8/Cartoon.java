package ReusingClassesChapter8;

import java.io.PrintStream;

public class Cartoon extends Drawing {
    private final PrintStream printStream;

    public Cartoon(PrintStream printStream) {
        this.printStream = printStream;
        System.out.println("Cartoon constructor");
    }

    public static void main(String[] args){
        PrintStream printStream= new PrintStream(System.out);
        Cartoon cartoon = new Cartoon(printStream);
    }
}
