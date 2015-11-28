package interfacesChapter10.rodentInterface;

import polymorphism.referencecounting.Shared;

import java.io.PrintStream;

public class Mouse implements Rodent {
    private final PrintStream printStream;
    private final MemberObject member;
    private final Shared shared;


    public Mouse(PrintStream printStream, Shared shared) {
        this.printStream = printStream;
        this.shared = shared;
        member = new MemberObject(printStream);
        printStream.println("Mouse()");
    }



    public void run() {

        printStream.println("Mouse Running");
    }


    public void attack(){
        printStream.println("Mouse to scared to attack");
    }

    public void incrementShared() {
        shared.addRef();
    }
}
