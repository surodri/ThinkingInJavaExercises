package interfacesChapter10.rodentInterface;

import java.io.PrintStream;

public interface Rodent {

    final PrintStream printStream = null;
    final MemberObject member = null;


    void run();

    void attack();
}
