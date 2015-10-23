package interfacesChapter10.factoryPatternEx18_19;

public class Factories {


    private static void buyCycle(CycleFactory factory) {

        Cycle newCycle = factory.getCycle();

    }

    private static void doTossing(TossingFactory factory) {
        Tossing tossingType = factory.getTossing();
    }

    public static void main(String[] args){
        buyCycle(new UnicycleFactory());
        buyCycle(new BicycleFactory());
        buyCycle(new TricycleFactory());

        doTossing(new CoinTossingFactory());
        doTossing(new DiceTossingFactory());
    }
}
