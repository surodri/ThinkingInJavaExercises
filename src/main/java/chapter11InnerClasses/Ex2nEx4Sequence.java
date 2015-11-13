package chapter11InnerClasses;

public class Ex2nEx4Sequence {

    private Object[] items;
    private int next = 0;

    public Ex2nEx4Sequence(int size) { items = new Object[size]; }

    private void add(Object object) {
        if(next < items.length)
            items[next++] = object;
    }
    private class SequenceSelector implements Selector {
        private int i = 0;
        public boolean end() {
            return i == items.length;}

        public Object current() { return items[i]; }

        public void next() { if(i < items.length) i++; }

        public void printAll() {
                while(!end()){
                    System.out.print(current() + " ");
                    next();
                }
        }

        public Ex2nEx4Sequence getSequence(){
            return Ex2nEx4Sequence.this;
        }
    }


    public Selector selector(){
        return new SequenceSelector();
    }


    public static void main(String[] args){
        Ex2nEx4Sequence sequence = new Ex2nEx4Sequence(10);
        for(int i=0; i<10 ; i++){
            sequence.add(Ex2Convertor.toString("Chunky Monkey"));
        }

        Selector selector = sequence.selector();
        selector.printAll();

        Ex5Outer outer = new Ex5Outer();
        Ex5Outer.Ex5Inner inner = outer.new Ex5Inner();
    }


}
