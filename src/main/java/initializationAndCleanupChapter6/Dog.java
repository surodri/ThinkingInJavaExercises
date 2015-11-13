package initializationAndCleanupChapter6;

import holdingYourObjects.Pet;

import java.io.PrintStream;

public class Dog implements Pet {

    private PrintStream printStream;

    public Dog(PrintStream printStream) {

        this.printStream = printStream;
        printStream.println("Dog");
    }

    protected void bark(String bark){printStream.println(bark);
    }

    protected void bark(char barkChar) { printStream.println(barkChar);
    }

    protected void bark(String paramOne, char paramTwo) {
        printStream.println(paramOne + "," +  paramTwo);
    }

    protected void bark(char paramOne, String paramTwo) {
        printStream.println(paramOne + "," +  paramTwo);
    }

}
