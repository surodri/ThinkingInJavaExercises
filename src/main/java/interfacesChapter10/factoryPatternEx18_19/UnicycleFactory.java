package interfacesChapter10.factoryPatternEx18_19;

public class UnicycleFactory implements CycleFactory{


    @Override
    public Cycle getCycle() {
        return new UnicycleImpl(System.out);
    }
}
