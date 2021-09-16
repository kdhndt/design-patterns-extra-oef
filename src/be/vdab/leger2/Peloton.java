package be.vdab.leger2;

import java.util.ArrayList;
import java.util.List;

public class Peloton implements Strijdbaar {
    private final int nummer;
    private List<Soldaat> soldaten = new ArrayList<>();

    public Peloton(int nummer) {
        this.nummer = nummer;
    }

    void add(Soldaat soldaat) {
        soldaten.add(soldaat);
    }

    @Override
    public void trekTenStrijde() {
        System.out.println("\t\t\t\tPeloton " + nummer + " trekt ten strijde met volgende soldaten:");
        soldaten.forEach(soldaat -> soldaat.trekTenStrijde());
    }
}
