package interfacesChapter10.rodentInterface;

import java.io.PrintStream;

public class Hamster implements Rodent {
    private final PrintStream printStream;
    private final MemberObject member;


    public Hamster(PrintStream printStream) {
        this.printStream = printStream;
        member = new MemberObject(printStream);
        printStream.println("Hamster()");
    }


    public void run() {
        printStream.println("Hamster running");
    }

    public void attack(){
        printStream.println("Hamster jelous attack");
    }
}
