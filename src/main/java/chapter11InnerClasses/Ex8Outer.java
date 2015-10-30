package chapter11InnerClasses;

public class Ex8Outer {
    Inner inner = new Inner();

    public void method() {
        inner.mySecret();
    }

    public class Inner{
        private String mySecret() {
            return "Blah";
        }

    }

    public static void main(String [] args){
        Ex8Outer ex8Outer = new Ex8Outer();
        //outer classes cant access inner classes private methods
        ex8Outer.inner.mySecret();
    }
}
