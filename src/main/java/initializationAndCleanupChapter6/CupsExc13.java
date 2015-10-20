package initializationAndCleanupChapter6;


import java.io.PrintStream;

public class CupsExc13 {
    static CupExc13 cup1;
    static CupExc13 cup2;

    static {
        cup1 = new CupExc13(1, new PrintStream(System.out));
        cup2 = new CupExc13(2, new PrintStream(System.out));
    }

    CupsExc13(){
        System.out.println("Cups()");
    }
}
