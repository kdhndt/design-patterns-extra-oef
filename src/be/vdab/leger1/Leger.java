package be.vdab.leger1;

import java.util.ArrayList;
import java.util.List;

public class Leger {
    private final List<Observer> observers = new ArrayList<>();
    private boolean tenStrijde = false;

    public void notifyObservers() {
        observers.forEach(observer -> observer.update(this));
    }

    public void addObservers(Observer observer) {
        observers.add(observer);
    }

    public boolean isTenStrijde() {


        return tenStrijde;
    }

    public void trekTenStrijde() {
        tenStrijde = true;
        System.out.println("Het leger trekt ten strijde.");
        notifyObservers();
    }

    public void roepVredeIn() {
        tenStrijde = false;
        System.out.println("Het leger roept vrede in.");
        notifyObservers();
    }
}
