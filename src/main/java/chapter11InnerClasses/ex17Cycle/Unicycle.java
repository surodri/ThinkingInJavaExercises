package chapter11InnerClasses.ex17Cycle;

public class Unicycle implements Cycle {

    public Unicycle() {
        System.out.println("Unicycle()");
    }

    public static CycleFactory factory = new CycleFactory(){

        @Override
        public Cycle getCycle() {
            return new Unicycle();
        }
    };

    @Override
    public void ride() {

    }
    public void drive(Cycle cycle) {
        cycle.ride();
    }
}
