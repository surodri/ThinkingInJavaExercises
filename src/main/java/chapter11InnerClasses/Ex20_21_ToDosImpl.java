package chapter11InnerClasses;

import java.io.PrintStream;

public class Ex20_21_ToDosImpl implements Ex20_21_ToDos {

    private final PrintStream printStream;

    public Ex20_21_ToDosImpl(PrintStream printStream) {
        this.printStream = printStream;
        printStream.println("Ex20_21_ToDos()");
    }

    @Override
    public String sing(String string) {
        return string;
    }

    @Override
    public String dance(String string) {
        return string;
    }

    public static void main(String[] arg){
        Ex20_21_ToDosImpl.NestedClass exercise20 = new Ex20_21_ToDosImpl.NestedClass(System.out);

        //Exercise 21 , is this the proper way to create the instance
        Ex20_21_ToDosImpl implementation = new Ex20_21_ToDosImpl(System.out);
        //Ex20_21_ToDosImpl.NestedClass exercise21 = implementation.new NestedClass(System.out);
        //exercise21.ex21CallInterfaceMethods(implementation);

        Ex20_21_ToDosImpl.NestedClass.ex21CallInterfaceMethods(new Ex20_21_ToDosImpl(System.out));

    }
}
