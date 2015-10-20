package polymorphism.music;

import java.io.PrintStream;

public class Instrument {
    private final PrintStream printStream;

    public Instrument(PrintStream printStream) {

        this.printStream = printStream;
    }

    public void play(Note note) {
        printStream.println("Instrument.play() " + note);
    }

    public String what() {
        return "Instrument";
    }

    public void adjust() {
        printStream.println("Adjusting Instrument");
    }

    public String typeToString() {
        return null;
    }
}
