package chapter11InnerClasses.ex17Cycle;

public class CoinTossing implements Tossing {

    public CoinTossing(){
        System.out.println("CoinTossing");
    }
    public void toss(){}
    public static TossingFactory factory = new TossingFactory(){
        public Tossing getTossing(){
            return new CoinTossing();
        }
    };
}
