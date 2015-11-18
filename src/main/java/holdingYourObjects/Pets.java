package holdingYourObjects;

import java.util.*;

/**
 * Created by srodriguez on 11/12/15.
 */
public class Pets {

    private static Map<Integer, Pet> petClasses = new HashMap<Integer, Pet>(){{
        put(0, new Dog(System.out));
        put(1, new Chicken(System.out));
        put(2, new Cat(System.out));
        put(3, new Hamster(System.out));
        }
    };

    public static List<Pet> arrayList(int numOfPets) {
        ArrayList<Pet> pets = new ArrayList<Pet>();
        while(numOfPets!=0){
            pets.add(randomPet());

        }
        return pets;
    }

    private static Pet randomPet() {
        Random generator = new Random();
        return petClasses.get(generator.nextInt()*petClasses.size());
    }
}
