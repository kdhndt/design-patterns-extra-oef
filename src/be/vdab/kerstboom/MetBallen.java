package be.vdab.kerstboom;

public class MetBallen extends KerstboomDecorator {

    public MetBallen(Informatie gedecoreerdeKerstboom) {
        super(gedecoreerdeKerstboom);
    }

    @Override
    public String getInformatie() {
        return gedecoreerdeKerstboom.getInformatie() + ", met ballen";
    }
}
