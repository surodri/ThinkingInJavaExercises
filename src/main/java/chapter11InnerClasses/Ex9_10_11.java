package chapter11InnerClasses;

public class Ex9_10_11 {

    //Exercise 9
    public Ex9Interface method() {
        class Inner implements Ex9Interface {

        }
        return new Inner();
    }

    //Exercise 10
    public void method10(){
        if(true) {
            class InnerEx10 implements Ex9Interface {

            }
        }
    }

    //Exercise 11
    private class InnerEx11 implements Ex9Interface {

    }

    public Ex9Interface method11() {
        class InnerEx11 implements Ex9Interface {

        }
        return new InnerEx11();
    }

    public Ex9Interface methodReturnsPrivateInnerInstance(){
        return new InnerEx11();
    }

    public static void main(String[] args){
        Ex9_10_11 ex9 = new Ex9_10_11();
        //Cannot downcast as mentioned in Exercise 11
        //InnerEx11 innerEx11 = ex9.methodReturnsPrivateInnerInstance();
    }

}
