package be.vdab.leger2;

import java.util.ArrayList;
import java.util.List;

public class Compagnie implements Strijdbaar {
    private final int nummer;
    private List<Peloton> pelotons = new ArrayList<>();

    public Compagnie(int nummer) {
        this.nummer = nummer;
    }

    void add(Peloton peloton) {
        pelotons.add(peloton);
    }

    @Override
    public void trekTenStrijde() {
        System.out.println("\t\t\tCompagnie " + nummer + " trekt ten strijde met volgende pelotons:");
        pelotons.forEach(peloton -> peloton.trekTenStrijde());
    }
}
