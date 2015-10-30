package chapter11InnerClasses;

public class Ex7Potatoe {

    private String skin;
    private Hands hands = new Hands();

    private void peel(){
        System.out.println("Peeling potatoes");
    }

    public  class Hands {
        public void prepareFood(){
            peel();
        }
    }

    public static void main(String [] args){

        Ex7Potatoe potatoe = new Ex7Potatoe();
        //Must instantiate an object of the inner class in outer class
        potatoe.hands.prepareFood();
    }
}

