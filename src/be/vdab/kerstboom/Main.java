package be.vdab.kerstboom;

public class Main {
    public static void main(String[] args) {
        var kerstboom = new Kerstboom();
        var kerstboomMetBallen = new MetBallen(kerstboom);
        System.out.println(kerstboomMetBallen.getInformatie());
        var test = new MetBallen(new MetSlingers(new MetLichtjes(new Kerstboom())));
        System.out.println(test.getInformatie());
    }
}
