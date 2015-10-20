package polymorphism.music;

import java.util.Random;

public class RandomInstrumentGenerator {

    private Random rand = new Random(47);
    public Instrument next() {
        switch(rand.nextInt(3)) {
            default:
            case 0: return new Stringed(System.out);
            case 1: return new Wind(System.out);
            case 2: return new Percussion(System.out);
        }
    }
}
