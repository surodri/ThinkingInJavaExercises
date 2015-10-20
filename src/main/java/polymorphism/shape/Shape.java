package polymorphism.shape;

import java.io.PrintStream;

public class Shape {

    private final PrintStream printStream;

    public Shape(PrintStream printStream) {

        this.printStream = printStream;
    }

    public void draw() {}

    public void erase() {
        printStream.println("New Method");
    }


}