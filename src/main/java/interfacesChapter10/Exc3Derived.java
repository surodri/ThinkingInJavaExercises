package interfacesChapter10;

public class Exc3Derived extends Exc3Base {
    int numberToPrint = 4;

    @Override
    public void print(){
        System.out.println(numberToPrint);
    }

    public static void main(String[] args){

        Exc3Derived ex3Derived = new Exc3Derived();
        ex3Derived.print();
    }

}
