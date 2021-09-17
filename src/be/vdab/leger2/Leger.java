package be.vdab.leger2;

import java.util.ArrayList;
import java.util.List;

public class Leger implements Strijdbaar {
    private final List<Bataljon> bataljons = new ArrayList<>();

    void add(Bataljon bataljon) {
        bataljons.add(bataljon);
    }


    @Override
    public void trekTenStrijde() {
        System.out.println("\tHet leger trekt ten strijde met volgende bataljons:");
        bataljons.forEach(Bataljon::trekTenStrijde);
    }
}
