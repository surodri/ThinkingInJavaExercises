package ReusingClassesChapter8;


import java.io.PrintStream;

public class DerivedClass extends BaseClass{
    private PrintStream printStream;

    DerivedClass(){}

    DerivedClass(PrintStream printStream ){
        super();
        this.printStream = printStream;
    }

    public static void main(String[] args){

        PrintStream printStream = new PrintStream(System.out);
        DerivedClass derivedClass = new DerivedClass(printStream);
    }
}
