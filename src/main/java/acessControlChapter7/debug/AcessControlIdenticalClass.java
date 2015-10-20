package acessControlChapter7.debug;

import java.io.PrintStream;

public class AcessControlIdenticalClass {

    private final PrintStream printMock;

    public AcessControlIdenticalClass(PrintStream printMock) {

        this.printMock = printMock;
    }

    public void debug(String debugMessage){
        printMock.println(debugMessage);
    }
}

