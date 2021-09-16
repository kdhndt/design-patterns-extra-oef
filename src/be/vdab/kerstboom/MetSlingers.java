package be.vdab.kerstboom;

public class MetSlingers extends KerstboomDecorator {
    public MetSlingers(Informatie gedecoreerdeKerstboom) {
        super(gedecoreerdeKerstboom);
    }

    @Override
    public String getInformatie() {
        return gedecoreerdeKerstboom.getInformatie() + ", met slingers";
    }
}
