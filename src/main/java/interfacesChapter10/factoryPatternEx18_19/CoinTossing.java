package interfacesChapter10.factoryPatternEx18_19;

import java.io.PrintStream;

public class CoinTossing implements Tossing {
    private final PrintStream printStream;

    public CoinTossing(PrintStream printStream) {
        this.printStream = printStream;
        printStream.println("CoinTossing");
    }

    @Override
    public void toss() {

    }
}
