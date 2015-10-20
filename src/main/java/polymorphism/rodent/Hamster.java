package polymorphism.rodent;

import java.io.PrintStream;

/**
 * Created by Thoughtworker on 10/13/15.
 */
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
