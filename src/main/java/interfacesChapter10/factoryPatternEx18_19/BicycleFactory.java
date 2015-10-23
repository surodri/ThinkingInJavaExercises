package interfacesChapter10.factoryPatternEx18_19;
public class BicycleFactory implements CycleFactory {


    @Override
    public Cycle getCycle() {
        return new BicycleImpl(System.out);
    }
}
