package interfacesChapter10.rodentInterface;

import polymorphism.referencecounting.Shared;

import java.io.PrintStream;

public class Rodents {
    private final PrintStream printStream;

    public Rodents(PrintStream printStream) {

        this.printStream = printStream;
    }


    public void allBehaviors(Rodent[] rodents) {
        for(Rodent rodent: rodents){
            rodent.run();
            rodent.attack();
        }
    }

    public static void main(String[] args){

        Shared shared = new Shared(System.out);
        Rodent[] animals = {
                new Mouse(System.out, shared),
                new Hamster(System.out),
                new Gerbil(System.out)
        };

        Rodents rodents = new Rodents(System.out);
        rodents.allBehaviors(animals);

    }
}
