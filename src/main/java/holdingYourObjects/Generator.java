package holdingYourObjects;

import java.util.*;

/**
 * Created by srodriguez on 11/12/15.
 */
public class Generator {

    int index = 0;
    private List<String> characters;

    public Generator(List<String> characters) {

        this.characters = characters;
    }

    private Collection<String> fill(Collection<String> collection, int numOfCharacters)
    {
        for(int i = 0; i<numOfCharacters; i++){
            collection.add(next());
        }
        return collection;
    }

    protected String next() {
        String character = characters.get(index);
        if((index+1)==characters.size())
        {
            index = 0;
        }else{
            index++;
        }
        return character;
    }


    public static void main(String [] args){

        Generator generator = new Generator(Arrays.asList("Yoda", "Princess Leia", "R2-D2"));
        System.out.println( generator.fill(new ArrayList<String>(), 1));
        System.out.println( generator.fill(new LinkedList<String>(), 2));
        System.out.println( generator.fill(new HashSet<String>(), 3)); //set = no duplicates, every character once
        System.out.println( generator.fill(new LinkedHashSet<String>(), 4));//set = no duplicates, every character once
        System.out.println( generator.fill(new TreeSet<String>(), 5));
    }
}
