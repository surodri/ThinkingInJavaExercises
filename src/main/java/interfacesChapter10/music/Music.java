package interfacesChapter10.music;

public class Music {

    private static RandomInstrumentGenerator randomInstrumentGenerator =
            new RandomInstrumentGenerator();
    public static void tune(Playable i) {

        i.play(Note.MIDDLE_C);
    }

    public static void main(String[] args) {
        Wind flute = new Wind(System.out);
        tune(flute);

        Instrument [] orchestra = {
                new Wind(System.out),
                new Percussion(System.out),
                new Stringed(System.out),
                new Woodwind(System.out)
        };

        Instrument[] instruments = new Instrument[5];

        for(int i = 0; i < instruments.length; i++)
            instruments[i] = randomInstrumentGenerator.next();

        for(Instrument instrument : instruments)
            instrument.what();
    }
}
