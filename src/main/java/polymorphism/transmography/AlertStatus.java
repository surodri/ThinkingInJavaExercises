package polymorphism.transmography;

public class AlertStatus {
    private Alert alert = new GreenAlert(System.out);
    public void change() { alert = new RedAlert(System.out); }
    public void go() { alert.broadCast(); }
}
