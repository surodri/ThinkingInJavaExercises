package ReusingClassesChapter8;

import java.io.PrintStream;

public class Root {

    private final PrintStream printStream;
    Component1 component1;
    Component2 component2;
    Component3 component3;

    public Root(PrintStream printStream) {
        this.printStream = printStream;
        printStream.println("Root constructor");
        component1 = new Component1(this.printStream);
        component2 = new Component2(this.printStream);
        component3 = new Component3(this.printStream);

    }

    public void dispose() {
        printStream.println("Root dispose");
        component1.dispose();
        component2.dispose();
        component3.dispose();
    }
}
