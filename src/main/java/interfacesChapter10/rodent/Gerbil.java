package interfacesChapter10.rodent;

import java.io.PrintStream;

public class Gerbil extends Rodent {
    private final PrintStream printStream;
    private MemberObject memberObject;

    public Gerbil(PrintStream printStream) {
        super(printStream);
        this.printStream = printStream;
        memberObject = new MemberObject(printStream);
        printStream.println("Gerbil()");
    }

    @Override
    public void run() {
        printStream.println("Gerbil running fast");
    }

    @Override
    public void attack(){
        printStream.println("Gerbil scary attack");
    }
}
