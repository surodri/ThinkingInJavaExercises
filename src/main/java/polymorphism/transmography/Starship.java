package polymorphism.transmography;


public class Starship {

    public static void main(String[] args) {
        AlertStatus alertStatus = new AlertStatus();
        alertStatus.go();
        alertStatus.change();
        alertStatus.go();
    }
}
