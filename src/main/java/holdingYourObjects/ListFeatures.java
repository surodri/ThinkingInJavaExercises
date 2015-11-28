package holdingYourObjects;

import interfacesChapter10.rodentInterface.Mouse;
import polymorphism.referencecounting.Shared;

import java.io.PrintStream;
import java.util.Collections;
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
        printStream.println("2: " + pets);
        printStream.println("3: " + pets.contains(hamster));
        pets.remove(hamster);

        Pet pet = pets.get(2);
        printStream.println("4: " + pet + " " + pets.indexOf(pet));

        Pet cymric = new Cymric();
        printStream.println("5: " + pets.indexOf(cymric));
        printStream.println("6: " + pets.remove(cymric));
        printStream.println("7: " + pets.remove(pet));  //must be the exact object
        printStream.println("8: " + pets);
        pets.add(3, (Pet) new Mouse(printStream, new Shared(printStream)));
        printStream.println("9: " + pets);

        List<Pet> subList = pets.subList(1, 4);
        printStream.println("subList: " + subList);
        printStream.println("10: " + pets.containsAll(subList));
        //sort(subList);
        printStream.println("sorted sublist: " + subList);
        printStream.println("11: " + pets.containsAll(subList));

        Collections.shuffle(subList, random);
    }
}
