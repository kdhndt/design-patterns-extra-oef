package be.vdab.leger1;

public class Main {
    public static void main(String[] args) {
        var leger = new Leger();
        var vijand1 = new Vijand(1);
        var vijand2 = new Vijand(2);
        leger.addObservers(vijand1);
        leger.addObservers(vijand2);
        leger.trekTenStrijde();
        leger.roepVredeIn();
    }
}
