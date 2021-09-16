package be.vdab.leger2;

public class Soldaat implements Strijdbaar {
    private final String voornaam;

    public Soldaat(String voornaam) {
        this.voornaam = voornaam;
    }

    @Override
    public void trekTenStrijde() {
        System.out.println("\t\t\t\t\tSoldaat " + voornaam + " trekt ten strijde");
    }
}
