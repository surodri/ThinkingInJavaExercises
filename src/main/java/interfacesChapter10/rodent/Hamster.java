package interfacesChapter10.rodent;

import java.io.PrintStream;

public class Hamster extends Rodent{
    private final PrintStream printStream;
    private final MemberObject member;


    public Hamster(PrintStream printStream) {
        super(printStream);
        this.printStream = printStream;
        member = new MemberObject(printStream);
        printStream.println("Hamster()");
    }

    @Override
    public void run() {
        printStream.println("Hamster running");
    }

    @Override
    public void attack(){
        printStream.println("Hamster jelous attack");
    }
}
