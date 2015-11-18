package holdingYourObjects;

import java.io.PrintStream;
import java.util.List;
import java.util.Random;

/**
 * Created by srodriguez on 11/12/15.
 */
public class ListFeatures {
    public static void main(String [] args){
        PrintStream printStream = System.out;
        Random random = new Random(47);
        List<Pet> pets = Pets.arrayList(7);
        printStream.println("1: " + pets);

        Hamster hamster = new Hamster(printStream);
        pets.add(hamster);
    }
}
