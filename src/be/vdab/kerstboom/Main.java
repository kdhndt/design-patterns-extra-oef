package be.vdab.kerstboom;

public class Main {
    public static void main(String[] args) {
        var kerstboom1 = new EenvoudigeKerstboom();
        var kerstboomMetBallen = new MetBallen(kerstboom1);
        System.out.println(kerstboomMetBallen.getInformatie());
        var kerstboom2 = new MetBallen(new MetSlingers(new MetLichtjes(new EenvoudigeKerstboom())));
        System.out.println(kerstboom2.getInformatie());
    }
}
