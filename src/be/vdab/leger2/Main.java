package be.vdab.leger2;

public class Main {
    public static void main(String[] args) {
        var leger = new Leger();
        var bataljon1 = new Bataljon(1);
        var bataljon2 = new Bataljon(2);
        var compagnie1 = new Compagnie(1);
        var compagnie2 = new Compagnie(2);
        var peloton1 = new Peloton(1);
        var peloton2 = new Peloton(2);
        var peloton3 = new Peloton(3);
        var peloton4 = new Peloton(4);
        var soldaat1 = new Soldaat("Heather");
        var soldaat2 = new Soldaat("Matthew");
        var soldaat3 = new Soldaat("Cory");
        var soldaat4 = new Soldaat("Kyla");
        var soldaat5 = new Soldaat("Kasey");
        var soldaat6 = new Soldaat("Tom");

        leger.add(bataljon1);
        leger.add(bataljon2);

        bataljon1.add(compagnie1);
        compagnie1.add(peloton1);
        compagnie1.add(peloton2);
        peloton1.add(soldaat1);
        peloton2.add(soldaat2);

        bataljon2.add(compagnie2);
        compagnie2.add(peloton3);
        compagnie2.add(peloton4);
        peloton3.add(soldaat3);
        peloton3.add(soldaat4);
        peloton4.add(soldaat5);
        peloton4.add(soldaat6);

        leger.trekTenStrijde();

    }
}
