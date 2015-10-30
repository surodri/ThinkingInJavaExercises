package chapter11InnerClasses.ex17Cycle;

public class Bicycle implements Cycle{
    public Bicycle() {
        System.out.println("Bicycle()");
    }

    public static CycleFactory factory = new CycleFactory() {
        @Override
        public Cycle getCycle() {
            return new Bicycle();
        }
    };

    @Override
    public void ride() {
    }

    public void drive(Cycle cycle) {
        cycle.ride();
    }
}
