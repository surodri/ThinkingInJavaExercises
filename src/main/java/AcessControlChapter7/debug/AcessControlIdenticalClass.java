package acessControlChapter7.debug;

import java.io.PrintStream;

/**
 * Created by Thoughtworker on 9/16/15.
 */
public class AcessControlIdenticalClass {

    private final PrintStream printMock;

    public AcessControlIdenticalClass(PrintStream printMock) {

        this.printMock = printMock;
    }

    public void debug(String debugMessage){
        printMock.println(debugMessage);
    }
}

