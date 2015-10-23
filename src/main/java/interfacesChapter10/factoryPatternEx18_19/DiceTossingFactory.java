package interfacesChapter10.factoryPatternEx18_19;
public class DiceTossingFactory implements TossingFactory {
    @Override
    public Tossing getTossing() {
        return new DiceTossing(System.out);
    }
}
