package ReusingClassesChapter8;

import java.io.PrintStream;

public class Stem extends Root {

    private final PrintStream printStream;
    Component1 component1;
    Component2 component2;
    Component3 component3;



    public Stem(PrintStream printStream){
        super(printStream);
        this.printStream = printStream;
        this.printStream.println("Stem constructor");
        this.component1 = new Component1(this.printStream);
        this.component2 = new Component2(this.printStream);
        this.component3 = new Component3(this.printStream);

    }


    public void dispose() {
        printStream.println("Stem dispose");
        super.dispose();
        component1.dispose();
        component2.dispose();
        component3.dispose();
    }

    public static void main(String[] args){

        Stem stem = new Stem(new PrintStream(System.out));

        stem.dispose();
    }

}
