package ReusingClassesChapter8;

public class Detergent {

    Cleanser cleanser = new Cleanser();

    // Change a method:
    public void scrub() {
        cleanser.append(" Detergent.scrub()");
        cleanser.scrub(); // Call base-class version
    }

    // Add methods to the interface:
    public void foam() {
        cleanser.append(" foam()");
    }


    private void dilute() {
        cleanser.dilute();
    }


    private void apply() {
        cleanser.apply();
    }

    // Test the new class:
    public static void main(String[] args) {
        Detergent x = new Detergent();
        x.dilute();
        x.apply();
        x.scrub();
        x.foam();
        System.out.println(x);
        System.out.println("Testing base class:");
        Cleanser.main(args);
    }


}
