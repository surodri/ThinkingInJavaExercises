package chapter11InnerClasses;



public class Ex1InitializeInnerClass {

    public static void main(String[] args){
       Ex1nEx3Outer out = new Ex1nEx3Outer("SomeString");
        Ex1nEx3Outer.Inner show = out.new Inner();
    }
}
