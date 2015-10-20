package polymorphism.rodent;

import java.io.PrintStream;

public class Rodent {

    private final PrintStream printStream;
    private final MemberObject member;

    public Rodent(PrintStream printStream) {

        this.printStream = printStream;
        member = new MemberObject(printStream);
        printStream.println("Rodent()");
    }

    public void run() {
        printStream.println("Rodent Running");
    }

    public void attack() {
        printStream.println("Rodent could attack");
    }
}
