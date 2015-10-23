package interfacesChapter10.factoryPatternEx18_19;

import java.io.PrintStream;

public class DiceTossing implements Tossing {

    private final PrintStream printStream;

    public DiceTossing(PrintStream printStream){

        this.printStream = printStream;
        printStream.println("DiceTossing");
    }
    @Override
    public void toss() {

    }
}
