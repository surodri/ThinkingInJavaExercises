package polymorphism.rodent;

import polymorphism.referencecounting.Shared;

import java.io.PrintStream;

public class Mouse extends Rodent {
    private final PrintStream printStream;
    private final MemberObject member;
    private final Shared shared;


    public Mouse(PrintStream printStream, Shared shared) {
        super(printStream);
        this.printStream = printStream;
        this.shared = shared;
        member = new MemberObject(printStream);
        printStream.println("Mouse()");
    }


    @Override
    public void run() {

        printStream.println("Mouse Running");
    }

    @Override
    public void attack(){
        printStream.println("Mouse to scared to attack");
    }

    public void incrementShared() {
        shared.addRef();
    }
}
