package chapter11InnerClasses;

import java.io.PrintStream;

public interface Ex20_21_ToDos {

    String sing(String string);
    String dance(String string);

    static class NestedClass {
        private static PrintStream printStream;

        public NestedClass(PrintStream printStream){

            this.printStream = printStream;
            printStream.println("NestedClass()");
        }

        static void ex21CallInterfaceMethods(Ex20_21_ToDos ex20_21){
            printStream.println(ex20_21.sing("A happy song!"));
            printStream.println(ex20_21.dance("Your thoughts away!"));
        }

    }
}
