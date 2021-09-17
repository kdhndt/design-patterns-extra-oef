package be.vdab.garage;

abstract class AutoDecorator implements Auto {
    public final Auto gedecoreerdeAuto;

    public AutoDecorator(Auto gedecoreerdeAuto) {
        this.gedecoreerdeAuto = gedecoreerdeAuto;
    }
}
