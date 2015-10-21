package interfacesChapter10.music;

import java.io.PrintStream;

public class Wind extends Instrument implements Playable{
    private final PrintStream printStream;

    public Wind(PrintStream printStream) {
        super(printStream);
        this.printStream = printStream;
    }

    public void play(Note note) {
        printStream.println("Wind.play() " + note);
    }

    public void adjust(){
        printStream.println("Adjusting Wind");

    }
    public String what(){

        return "Wind";
    }

}
