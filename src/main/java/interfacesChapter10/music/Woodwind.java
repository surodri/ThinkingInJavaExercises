package interfacesChapter10.music;

import java.io.PrintStream;

public class Woodwind extends Wind {
    private final PrintStream printStream;

    public Woodwind(PrintStream printStream) {
        super(printStream);
        this.printStream = printStream;
    }

    public void play(Note note) {
        printStream.println("Woodwind.play() " + note);
    }

    public String what() {
        return "Woodwind";
    }
}
