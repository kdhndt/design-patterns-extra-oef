package be.vdab.leger2;

import java.util.ArrayList;
import java.util.List;

public class Bataljon implements Strijdbaar {
    private final int nummer;
    private List<Compagnie> compagnies = new ArrayList<>();

    public Bataljon(int nummer) {
        this.nummer = nummer;
    }

    void add(Compagnie compagnie) {
        compagnies.add(compagnie);
    }

    @Override
    public void trekTenStrijde() {
        System.out.println("\t\tBataljon " + nummer + " trekt ten strijde met volgende compagnies:");
        compagnies.forEach(compagnie -> compagnie.trekTenStrijde());
    }
}
