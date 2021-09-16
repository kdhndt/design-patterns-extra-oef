package be.vdab.kerstboom;

public class MetLichtjes extends KerstboomDecorator {
    public MetLichtjes(Informatie gedecoreerdeKerstboom) {
        super(gedecoreerdeKerstboom);
    }

    @Override
    public String getInformatie() {
        return gedecoreerdeKerstboom.getInformatie() + ", met lichtjes";
    }
}
