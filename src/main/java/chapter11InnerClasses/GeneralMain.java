package chapter11InnerClasses;

public class GeneralMain {


    public static void main(String [] args){
        Ex8Outer ex8Outer = new Ex8Outer();
        //outer classes cant access inner classes private methods
        ex8Outer.method();

    }

}
