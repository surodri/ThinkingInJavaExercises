package chapter11InnerClasses;
public class Ex22Sequence {
    private Object[] items;
    private int next = 0;
    public Ex22Sequence(int size) { items = new Object[size]; }
    public void add(Object x) {
        if(next < items.length)
            items[next++] = x;
    }
    private class SequenceSelector implements Selector {
        private int i = 0;
        public boolean end() { return i == items.length; }
        public Object current() { return items[i]; }
        public void next() { if(i < items.length) i++; }

        public void printAll() {
            while(!end()){
                System.out.print(current() + " ");
                next();
            }
        }
    }

    private class ReverseSelector implements Selector {
        private int i = 0;

        public ReverseSelector(int length) {
            this.i = length;
        }

        public boolean end() { return i == 0; }
        public Object current() { return items[i]; }
        public void next() { if(i < items.length) i--; }

        public void printAll() {
            while(!end()){
                System.out.print(current() + " ");
                next();
            }
        }
    }

    public Selector selector() {
        return new SequenceSelector();
    }

    public Selector reverseSelector(){
        return new ReverseSelector(items.length);
    }

    public static void main(String[] args) {
        Ex22Sequence sequence = new Ex22Sequence(10);
        for(int i = 0; i < 10; i++)
            sequence.add(Integer.toString(i));

        Selector selector = sequence.selector();

        while(!selector.end()) {
            System.out.print(selector.current() + " ");
            selector.next();



        }
        Selector reverseSelector = sequence.reverseSelector();


        while(!reverseSelector.end()) {
            System.out.print(selector.current() + " ");
            selector.next();


            System.out.print(reverseSelector.current() + " ");
            reverseSelector.next();

        }



    }
}
