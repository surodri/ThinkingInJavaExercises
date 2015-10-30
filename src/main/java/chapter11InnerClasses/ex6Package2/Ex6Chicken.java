package chapter11InnerClasses.ex6Package2;

import interfacesChapter10.Exc6;
import interfacesChapter10.Exc6Interface;

public class Ex6Chicken extends Exc6{

    public Exc6Interface getInnerClass(){
        //The inner class needed a public constructor because
        // since the class was protected the default constructor was protected
        return new Exc6.Separate();
    }
}
