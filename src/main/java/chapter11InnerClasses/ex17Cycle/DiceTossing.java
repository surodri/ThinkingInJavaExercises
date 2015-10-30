package chapter11InnerClasses.ex17Cycle;

public class DiceTossing implements Tossing{


    public DiceTossing(){
        System.out.println("DiceTossing()");
    }
    @Override
    public void toss() {

    }

    public static TossingFactory factory = new TossingFactory(){

        @Override
        public Tossing getTossing() {
            return new DiceTossing();
        }
    };

}
