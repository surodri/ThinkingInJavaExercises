package polymorphism.meal;

import java.io.PrintStream;

public class Sandwich extends PortableLunch{
    private final PrintStream printStream;
    private Bread bread;
    private Cheese cheese;
    private Lettuce lettuce;
    private Pickle pickle;

    public Sandwich(PrintStream printStream) {
        super(printStream);
        this.printStream = printStream;
        bread = new Bread(printStream);
        cheese = new Cheese(printStream);
        lettuce = new Lettuce(printStream);
        pickle = new Pickle(printStream);
        printStream.println("Sandwich()");
    }

    public static void main(String[] args){
        new Sandwich(System.out);
    }


}
