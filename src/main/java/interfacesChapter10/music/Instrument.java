package interfacesChapter10.music;

import java.io.PrintStream;

public abstract class Instrument {
    private final PrintStream printStream;

    public Instrument(PrintStream printStream) {

        this.printStream = printStream;
    }

    abstract String what();

    abstract void adjust();

    public String typeToString() {
        return null;
    }
}
