package interfacesChapter10.rodentInterface;

import java.io.PrintStream;

public interface Rodent {

    final PrintStream printStream = null;
    final MemberObject member = null;


    public void run();

    public void attack();
}
