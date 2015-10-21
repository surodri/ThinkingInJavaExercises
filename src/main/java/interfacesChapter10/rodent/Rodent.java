package interfacesChapter10.rodent;

import java.io.PrintStream;

public abstract class Rodent {

    private final PrintStream printStream;
    private final MemberObject member;

    public Rodent(PrintStream printStream) {

        this.printStream = printStream;
        member = new MemberObject(printStream);
        printStream.println("Rodent()");
    }

    public abstract void run();

    public abstract void attack();
}
