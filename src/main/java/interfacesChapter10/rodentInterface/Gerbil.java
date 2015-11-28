package interfacesChapter10.rodentInterface;

import java.io.PrintStream;

public class Gerbil implements Rodent {
    private final PrintStream printStream;
    private MemberObject memberObject;

    public Gerbil(PrintStream printStream) {
        this.printStream = printStream;
        memberObject = new MemberObject(printStream);
        printStream.println("Gerbil()");
    }


    public void run() {
        printStream.println("Gerbil running fast");
    }

    public void attack(){
        printStream.println("Gerbil scary attack");
    }
}
