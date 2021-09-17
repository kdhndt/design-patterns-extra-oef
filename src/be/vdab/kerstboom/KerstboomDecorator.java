package be.vdab.kerstboom;

abstract class KerstboomDecorator implements Kerstboom {
    protected final Kerstboom gedecoreerdeKerstboom;

    public KerstboomDecorator(Kerstboom gedecoreerdeKerstboom) {
        this.gedecoreerdeKerstboom = gedecoreerdeKerstboom;
    }
}
