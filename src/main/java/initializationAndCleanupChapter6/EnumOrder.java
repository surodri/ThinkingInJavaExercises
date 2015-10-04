package initializationAndCleanupChapter6;

import java.io.PrintStream;

import static initializationAndCleanupChapter6.PaperCurrency.*;

public class EnumOrder {
    private final PrintStream printStream;

    public EnumOrder(PrintStream printStream) {

        this.printStream = printStream;
    }

    public void printEnumsExercise21() {

        for(PaperCurrency car: values()){
            printStream.println(car + ", ordinal " + car.ordinal());
        }
    }

    public void describeExercise22(PaperCurrency currency) {
        switch(currency){
            case CANADIAN: printStream.println("Currency from Cade's land");
            case PESO: printStream.println("Currency from Susana's land");
        }
    }
}
