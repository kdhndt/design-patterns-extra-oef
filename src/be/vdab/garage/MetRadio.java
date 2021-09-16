package be.vdab.garage;

import java.math.BigDecimal;

public class MetRadio extends AutoDecorator {
    public MetRadio(Auto gedecoreerdeAuto) {
        super(gedecoreerdeAuto);
    }

    @Override
    public BigDecimal getPrijs() {
        return gedecoreerdeAuto.getPrijs().add(BigDecimal.valueOf(100));
    }
}
