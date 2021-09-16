package be.vdab.garage;

public class Main {
    public static void main(String[] args) {
        var autoMetReservewiel = new MetReservewiel(new BarebonesAuto());
        System.out.println(autoMetReservewiel.getPrijs());

        var autoMetReservewielEnTrekhaakEnRadio = new MetRadio(new MetTrekhaak(new MetReservewiel(new BarebonesAuto())));
        System.out.println(autoMetReservewielEnTrekhaakEnRadio.getPrijs());
    }
}