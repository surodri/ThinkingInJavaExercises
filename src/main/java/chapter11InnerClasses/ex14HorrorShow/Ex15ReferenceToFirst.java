package chapter11InnerClasses.ex14HorrorShow;

public class Ex15ReferenceToFirst {

    public Ex15First create(){
        return new Ex15First(System.out){

        };
    }
}
