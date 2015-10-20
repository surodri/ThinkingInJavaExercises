package initializationAndCleanupChapter6;

import java.io.PrintStream;

public class Exercises16_17_18_19 {
    private final PrintStream printStream;

    public Exercises16_17_18_19(PrintStream printStream)
    {
        this.printStream = printStream;
    }

    public void printString(String argument){
        this.printStream.println(argument);
    }

    public void print(String[] array) {
        for(int i =0; i<array.length; i++){
            printStream.println(array[i]);
        }
    }


    public void flurp(String... args) {

        for(String tasty: args){
            printStream.println(tasty);
        }
    }

    public static void main(String... args) {

        PrintStream printStreamInUse = new PrintStream(System.out);

        Exercises16_17_18_19[] exercise17and18 = new Exercises16_17_18_19[2];
        exercise17and18[0] = new Exercises16_17_18_19(printStreamInUse);
        exercise17and18[1] = new Exercises16_17_18_19(printStreamInUse);

        exercise17and18[0].printString("peep");
        exercise17and18[1].printString("poop");


        Exercises16_17_18_19 exercise20 = new Exercises16_17_18_19(printStreamInUse);
        exercise20.flurp(args);
    }


}
