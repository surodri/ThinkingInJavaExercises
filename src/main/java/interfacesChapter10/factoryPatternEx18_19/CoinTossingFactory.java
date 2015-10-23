package interfacesChapter10.factoryPatternEx18_19;

public class CoinTossingFactory implements TossingFactory{


    @Override
    public Tossing getTossing() {
        return new CoinTossing(System.out);
    }


}
