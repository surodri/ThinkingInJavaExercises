package ReusingClassesChapter8;

import java.io.PrintStream;

public class A extends C {

    private PrintStream printStream;

    public A(PrintStream printStream){
        super(printStream);

        this.printStream = printStream;
        System.out.println("Class A is announcing itself");
    }

    public static void main (String[] args){
        A a = new A(new PrintStream(System.out));
    }
}
