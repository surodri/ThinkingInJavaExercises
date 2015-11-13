package holdingYourObjects;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by srodriguez on 11/12/15.
 */
public class SimpleCollection {
    public static void main(String [] args){
        Set<Integer> collection = new HashSet<Integer>();

        for(int i= 0; i<10 ; i++){
            collection.add(i);
        }

        for(Integer number: collection ){
            System.out.print(number + ", ");
        }
    }
}
