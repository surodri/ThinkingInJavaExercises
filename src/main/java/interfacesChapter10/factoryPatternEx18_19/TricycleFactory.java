package interfacesChapter10.factoryPatternEx18_19;

public class TricycleFactory implements CycleFactory {
    @Override
    public Cycle getCycle() {
        return new TricycleImpl(System.out);
    }
}
