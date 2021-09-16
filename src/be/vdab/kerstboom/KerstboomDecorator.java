package be.vdab.kerstboom;

abstract class KerstboomDecorator implements Informatie {
    protected final Informatie gedecoreerdeKerstboom;

    public KerstboomDecorator(Informatie gedecoreerdeKerstboom) {
        this.gedecoreerdeKerstboom = gedecoreerdeKerstboom;
    }
}
