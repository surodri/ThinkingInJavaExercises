package chapter11InnerClasses.ex17Cycle;

public class Tricycle implements Cycle {

    public Tricycle() {
        System.out.println("Tricycle()");
    }

    public static CycleFactory factory = new CycleFactory() {

        @Override
        public Cycle getCycle() {
            return new Tricycle();
        }
    };

    @Override
    public void ride() {

    }

    public void drive(Cycle cycle) {
        cycle.ride();
    }
}
