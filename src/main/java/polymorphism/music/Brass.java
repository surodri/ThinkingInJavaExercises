package polymorphism.music;

import java.io.PrintStream;

public class Brass extends Wind {
    private final PrintStream printStream;

    public Brass(PrintStream printStream) {
        super(printStream);
        this.printStream = printStream;
    }

    public void play(Note note) {
        printStream.println("Brass.play() " + note);
    }

    public void adjust() {
        printStream.println("Adjusting Brass");
    }
}
