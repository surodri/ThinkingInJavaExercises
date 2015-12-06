package containersInDepth;

import java.util.*;

import static containersInDepth.Countries.names;

/**
 * Created by srodriguez on 12/1/15.
 */
public class UsingAbstractClassesEx1_2_3_4_5 {


    private void ex1HowSuffleMethodRandomizes() {
        List countriesArrayList = new ArrayList<String>(names(5));
        System.out.println("ArrayList");
        printListSortedAndShuffled(countriesArrayList);

        List countriesLinkedList = new LinkedList<String>(names(5));
        System.out.println("LinkedList");
        printListSortedAndShuffled(countriesLinkedList);

    }

    private void printListSortedAndShuffled(List countriesList) {
        System.out.println("Original: " + countriesList);
        Collections.sort(countriesList);
        System.out.println("Sorted: " + countriesList);
        Collections.shuffle(countriesList);
        System.out.println("Shuffle1: " + countriesList);
        Collections.shuffle(countriesList);
        System.out.println("Shuffle2: " + countriesList);
    }


    private void ex2PrintMapOfCountriesStartingWithA() {


        Map<String, String> mapiMap = new HashMap<String, String>();
            Iterator iterator = Countries.capitals().entrySet().iterator();

        while(iterator.hasNext()){
            Map.Entry element = (Map.Entry) iterator.next();
            if(element.getKey().toString().startsWith("A")) {
                mapiMap.put(element.getKey().toString(), element.getValue().toString());
            }
        }
        System.out.println(mapiMap);
    }

    private void ex2PrintSetOfCountriesStartingWithA() {
        Set<String> setiSet = new HashSet<String>();
        for(String country: Countries.names()){
            if(country.startsWith("A")){
                setiSet.add(country);
            }
        }
        System.out.println(setiSet);
    }

    public static void main(String[] args){
        UsingAbstractClassesEx1_2_3_4_5 usingAbstractClasses = new UsingAbstractClassesEx1_2_3_4_5();
        usingAbstractClasses.ex1HowSuffleMethodRandomizes();

        usingAbstractClasses.ex2PrintMapOfCountriesStartingWithA();
        usingAbstractClasses.ex2PrintSetOfCountriesStartingWithA();

    }

}
