package chapter11InnerClasses.ex17Cycle;


public class Factories {

    public static void buyClycle(CycleFactory factory){
        Cycle cycle = factory.getCycle();
    }
    public static void doTossing(TossingFactory factory){Tossing tossing = factory.getTossing();}
    public static void main(String[] args){
        buyClycle(Bicycle.factory);
        buyClycle(Unicycle.factory);
        buyClycle(Tricycle.factory);

        doTossing(CoinTossing.factory);
        doTossing(DiceTossing.factory);
    }
}
