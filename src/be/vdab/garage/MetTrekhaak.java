package be.vdab.garage;

import java.math.BigDecimal;

public class MetTrekhaak extends AutoDecorator {
    public MetTrekhaak(Auto gedecoreerdeAuto) {
        super(gedecoreerdeAuto);
    }

    @Override
    public BigDecimal getPrijs() {
        return gedecoreerdeAuto.getPrijs().add(BigDecimal.valueOf(500));
    }
}
