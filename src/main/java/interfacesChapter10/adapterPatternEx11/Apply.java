package interfacesChapter10.adapterPatternEx11;

public class Apply {

    public static void process(Processor processor, Object object) {
        System.out.println("Using Processor: " + processor.name() );
        System.out.println("Swapping string: " + object);
        System.out.println(processor.process(object));
    }
}
