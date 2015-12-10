package holdingYourObjects;

import java.io.PrintStream;
import java.util.ArrayList;

/**
 * Created by srodriguez on 11/5/15.
 */
public class Gerbil {


    private final PrintStream printStream;
    int gerbilNumber;

    public Gerbil(PrintStream printStream, int gerbilNumber){
        this.printStream = printStream;
        this.gerbilNumber = gerbilNumber;
    }
    protected void hop() {
        printStream.println(gerbilNumber);
    }


    public static void main(String[] args){

    }
}
