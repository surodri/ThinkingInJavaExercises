package interfacesChapter10;

public class Exc4Derived extends AbstractClassNoMethods {

    public static void downcastingMethod(AbstractClassNoMethods abstractClassNoMethods){
        Exc4Derived downCastedClass = (Exc4Derived) abstractClassNoMethods;
        downCastedClass.downcastingMethod(null);
    }

    public static void main(String [] args){
        Exc4Derived ex4Derived = new Exc4Derived();
        AbstractClassNoMethods abstractClassNoMethods =  new AbstractClassNoMethods() {
            @Override
            public int hashCode() {
                return super.hashCode();
            }
        };
        ex4Derived.downcastingMethod(abstractClassNoMethods);
    }
}
