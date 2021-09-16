package be.vdab.leger1;

public class Vijand implements Observer {
    private final int nummer;

    public Vijand(int nummer) {
        this.nummer = nummer;
    }

    @Override
    public void update(Leger leger) {
        if (leger.isTenStrijde()) {
            System.out.println("Vijand " + nummer + " vuurt raketten af.");
        } else {
            System.out.println("Vijand " + nummer + " start de onderhandelingen op.");
        }
    }
}
