package holdingYourObjects;

import chapter11InnerClasses.Selector;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by srodriguez on 11/12/15.
 */
public class Sequence {
    private ArrayList<Object> items;
    private final PrintStream printStream;
    private int next = 0;

    public Sequence(List<Object> items, PrintStream printStream) {
        this.printStream = printStream;
        this.items = (ArrayList<Object>) items;
    }

    protected void add(Object item) {
        items.add(item);
    }


    private class SequenceSelector implements Selector{

        int index;
        public boolean end() {
            return index == items.size();
        }

        public Object current() {
            return items.get(index);
        }

        public void next() {
            if(index<items.size()) items.get(index++);
        }

        public void printAll() {
            while(!this.end()){
                printStream.print(this.current() + " ");
                this.next();
            }
        }
    }

    public Selector selector(){
        return new SequenceSelector();
    }
    public static void main(String [] args){
        ArrayList<Object> items = new ArrayList<Object>();
        PrintStream printStream = System.out;
        Sequence sequence = new Sequence(items, printStream);
        for(int i =0 ; i<10; i++){
            sequence.add(Integer.toString(i));
        }
        Selector selector = sequence.selector();
        selector.printAll();
    }

}
