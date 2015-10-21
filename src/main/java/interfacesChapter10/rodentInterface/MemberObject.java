package interfacesChapter10.rodentInterface;

import java.io.PrintStream;

public class MemberObject {
    private final PrintStream printStream;

    public MemberObject(PrintStream printStream) {
        this.printStream = printStream;
        printStream.println("MemberObject()");
    }

}
