package be.vdab.garage;

abstract class AutoDecorator implements Auto {
    public Auto gedecoreerdeAuto;

    public AutoDecorator(Auto gedecoreerdeAuto) {
        this.gedecoreerdeAuto = gedecoreerdeAuto;
    }
}
