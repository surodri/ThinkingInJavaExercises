package chapter11InnerClasses;

public class Ex1nEx3Outer {

    private String privateString;
    public Ex1nEx3Outer(String privateString){
        this.privateString = privateString;
    }

    public class Inner{

        public String toString(){
            return privateString;
        }
    }

    public Inner inner(){
        return new Inner();
    }
    public static void main(String [] arg){
        Ex1nEx3Outer outer = new Ex1nEx3Outer("Haha you are it");
        Ex1nEx3Outer.Inner inner =  outer.inner();
        System.out.println(inner.toString());
    }
}
